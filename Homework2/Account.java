package Homework2;

public interface Account {
    
    void put();
//{
    //if (cash >= 0) {
    //    this.balance += cash;
    //}  
    //else
    //{
    //    throw new IllegalArgumentException("Невозможно выполнить операцию!");
    //}
//}
    void take();
//{
    // if (balance >= cash && cash >= 0) {
    //this.balance -= cash;
    //}
    //else
    //{
    //    throw new IllegalArgumentException("Невозможно выполнить операцию!");
    //}  
//}
    double getAmount();
//{
    //return balance; 
//}
}

