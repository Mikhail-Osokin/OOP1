package Homework1;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends Account {
    LocalDate date;
    public DepositAccount (double balance, LocalDate date){
    super(balance);
    this.date = date;
}
@Override
public void take (double cash) {
    if (null!=date && LocalDate.now().isAfter(date.plus(1,ChronoUnit.MONTHS))) {
        this.balance -= cash;
        this.date = LocalDate.now();
        }
    else
        {
        throw new IllegalArgumentException("Слишком много попыток снятия средств");
        }
}
}