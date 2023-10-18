package Java;

public class Account {
    double balance;
    
    public Account(double balance){
        this.balance = balance;
    }

    public void put (double cash)
{
    if (cash >= 0) {
        this.balance += cash;
    }  
    else
    {
        throw new IllegalArgumentException("Невозможно выполнить операцию!");
    }
}
    public void take (double cash)
{
    if (balance >= cash && cash >= 0) {
    this.balance -= cash;
    }
    else
    {
        throw new IllegalArgumentException("Невозможно выполнить операцию!");
    }  
}
    public double getAmount ()
{
    return balance; 
}
}
