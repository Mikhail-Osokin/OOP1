package Homework2;

public class CreditAccount extends AbstractAccount implements Account {
    public CreditAccount(double balance){
    super(balance);
    }

@Override
public void put(){

}

@Override
public void take() {
   
}


@Override
public double getAmount() {
    return this.balance;
}

@Override
    public void doTake (double cash) {
        super.balance -= cash + cash/100;
}
}