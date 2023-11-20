package Test.Homework1;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DepositAccountTest {
    
    @Test
    void TestPutDepositAccount() {
        DepositAccount testObject = new DepositAccount(0, LocalDate.of(2023, 11, 20));
        testObject.put(100);
        Assertions.assertEquals(100, testObject.getAmount());
    }

    @Test
    void TestTakeDepositAccount() {
        DepositAccount testObject = new DepositAccount(0, LocalDate.of(2023, 11, 20));
        testObject.put(100);
        testObject.take(50);
        Assertions.assertEquals(50, testObject.getAmount());
    }
    
    @Test
    void TestTakeDepositAccountIllegalArgumentException() {
        DepositAccount testObject = new DepositAccount(0, LocalDate.of(2023, 11, 20));
        Assertions.assertThrows(testObject.IllegalArgumentException("Слишком много попыток снятия средств"), () -> testObject.take(50));
    }
    
}
