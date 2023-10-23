package Homework2;
import java.time.LocalDate;
import java.util.Calendar;

import Homework2.Account;
import Homework2.CreditAccount;
import Homework2.DepositAccount;


public class Homework2 {
    public static void main(String[] args) {
        CreditAccount account = new CreditAccount (250);
        System.out.println(account.getAmount());
        account.put(50);
        System.out.println(account.getAmount());
        account.take(100);
        System.out.println(account.getAmount());
        DepositAccount account1 = new DepositAccount(250, LocalDate.of(2023, 8, 10));
        account1.take(200);
        System.out.println(account1.getAmount());
        FixedAmountAccount account2 = new FixedAmountAccount(250);
        account2.take(100);
        System.out.println(account2.getAmount());
    }
}
