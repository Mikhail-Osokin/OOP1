package Test.Homework1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditAccountTest {
    
    @Test
    void TestTakeCreditAccount() {
        CreditAccount testObject = new CreditAccount(0);
        testObject.put(100);
        testObject.take(50);
        Assertions.assertEquals(49.5, testObject.getAmount());
    }
}
