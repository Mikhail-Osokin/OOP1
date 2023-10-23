package Homework2;

public abstract class AbstractAccount implements Account {
    double balance;  
    public AbstractAccount (double balance){
    this.balance = balance; 
    }

    public final double getAmount(double balance){
        return balance;
    }

    public final void take(double cash) {
      if (cash >= 0) {
        doTake(cash);
        } 
        else {
        throw new IllegalArgumentException("Сумма снятия должна быть положительной");
      }
    }
    protected void doTake(double cash) {
        this.balance -= cash;
    }

    public final void put(double cash) {
      if (cash >= 0) {
        doPut(cash);
      } 
        else {
        throw new IllegalArgumentException("Сумма внесения должна быть положительной");
      }
    }

    protected void doPut(double cash) {
        this.balance += cash;
    }
 
}

