package Homework2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends AbstractAccount implements Account{
    LocalDate date;
    public DepositAccount (double balance, LocalDate date){
    super(balance);
    this.date = date;
}
@Override
public void doTake (double cash) {
    if (null!=date && LocalDate.now().isAfter(date.plus(1,ChronoUnit.MONTHS))) {
        this.balance -= cash;
        this.date = LocalDate.now();
        }
    else
        {
        throw new IllegalArgumentException("Слишком много попыток снятия средств");
        }
}
@Override
public void put() {
    
}
@Override
public void take() {
    
}
@Override
public double getAmount() {
    return this.balance;
}
}