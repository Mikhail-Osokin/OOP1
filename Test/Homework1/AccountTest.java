package Test.Homework1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {
    
    @Test
    void TestPutAccount() {
        Account testObject = new Account(0);
        testObject.put(100);
        Assertions.assertEquals(100, testObject.getAmount());
    }

    @Test
    void TestTakeAccount() {
        Account testObject = new Account(0);
        testObject.put(100);
        testObject.take(50);
        Assertions.assertEquals(50, testObject.getAmount());
    }
}
