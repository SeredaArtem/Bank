import accounts.*;

import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        PaymentAccount paymentAccount =  new PaymentAccount();
        CardAccount cardAccount = new CardAccount();
        DepositaryAccount depositaryAccount = new DepositaryAccount();
        while (true) {

            System.out.println("depositaryAccount");
            depositaryAccount.show();
            depositaryAccount.putOn(1000);
            depositaryAccount.withdraw(10);
            depositaryAccount.show();

            System.out.println("paymentAccount");
            paymentAccount.putOn(100);
            paymentAccount.show();
            paymentAccount.withdraw(10);
            paymentAccount.show();

            System.out.println("cardAccount");
            cardAccount.show();
            cardAccount.putOn(100);
            cardAccount.show();
            cardAccount.withdraw(10);
            cardAccount.show();
            System.out.println("-----------------------------------------------------------------------------------");

        }
    }
}
