package Homework1;

public class CreditAccount extends Account {
    public CreditAccount(double balance){
    super(balance);
    }


@Override
    public void take (double cash) {
        super.balance -= cash + cash/100;
    }
}