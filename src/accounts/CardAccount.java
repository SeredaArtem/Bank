package accounts;

public class CardAccount extends PaymentAccount {
    @Override
    public double withdraw(double money){
        if (money > accountMoney) {
            System.out.println("У вас недостаточно средств");
        }else {
            accountMoney = accountMoney - money - (money * 0.01);
        }
        return accountMoney;
    }
}
