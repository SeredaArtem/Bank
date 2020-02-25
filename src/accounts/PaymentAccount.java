package accounts;

import java.util.Scanner;

public class PaymentAccount {
    double accountMoney = 0;

    public double withdraw(double money) {
        if (money > accountMoney) {
            System.out.println("У вас недостаточно средств");
        }else {
            accountMoney = accountMoney - money;
        }
        return accountMoney;
    }


    public double putOn(double money){
        accountMoney = accountMoney + money;
        return accountMoney;
    }

    public void show(){
        System.out.println("На вашем счету осталось: " + accountMoney);
    }

}
