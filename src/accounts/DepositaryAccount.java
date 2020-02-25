package accounts;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DepositaryAccount extends PaymentAccount {
    private SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    private Calendar calendar = Calendar.getInstance();
    private Date datePutOn;
    private Date dateAfterMonths;
    private Date dateWithdraw;

    @Override
    public double putOn(double money){
        datePutOn = calendar.getTime();
        calendar.add(Calendar.MONTH , 1);
        dateAfterMonths = calendar.getTime();
        accountMoney = accountMoney + money;
        return accountMoney;
    }


    @Override
    public double withdraw(double money){
        dateWithdraw = calendar.getTime();
        if (dateWithdraw.after(dateAfterMonths)){
            if (money > accountMoney) {
                System.out.println("У вас недостаточно средств");
            }else {
                accountMoney = accountMoney - money;
            }
        }else {
            System.out.println("Вы не можете снять деньги пока не пройдет месяц с последнего пополнения. Вы положили деньги:  " + format.format(datePutOn));
        }
        return accountMoney;
    }
}
