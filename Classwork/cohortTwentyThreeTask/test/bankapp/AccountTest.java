package bankapp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account account = new Account("Edwin Aboje","12345","1");

    @BeforeEach
    public void startwith() {
        Account account = new Account("Edwin Aboje", "12345", "1");
    }

    @Test
    public void testThatAccountClassCanDepositWithCorrectPin() {
        String correctPin = "1234";
        account.setPin(correctPin);
        account.deposit(10_000);
        assertEquals(10_000,account.checkBalance(correctPin));
    }

    @Test
    public void testThatAccountClassCanNotDepositWithNegetiveOrZeroIntegers(){
        assertThrows(IllegalArgumentException.class, () -> account
                .deposit(0));
    }

    @Test
    public void testThatAccountClassCanWithdraw() {
        String correctPin = "1234";
        account.setPin(correctPin);
        account.deposit(10_000);
        assertEquals(10_000,account.checkBalance(correctPin));
        String correctPin2 = "5678";
        account.setPin(correctPin2);
        account.withdraw(5_000,correctPin2);
        assertEquals(5_000,account.checkBalance(correctPin2));
    }

    @Test
    public void testThatAccountClassCannotWithdrawZeroNegativeAndHandlesIncorrectPinExceptions() {
        String correctPin = "1234";
        account.setPin(correctPin);
        String incorrectPin = "5678";
       account.setPin(incorrectPin);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(0,correctPin));
    }

    @Test
    public void testThatAccountClassReturnsCorrectName(){
        account.setName("Aboje Edwin");
        assertEquals("Aboje Edwin",account.getName());

    }
    @Test
    public void testThatAccountClassCanDepositWithdrawAndReturnCorrectBalance() {
        String correctPin = "1234";
        account.setPin(correctPin);
        account.deposit(10_000_000);
        assertEquals(10_000_000,account.checkBalance(correctPin));
        String correctPin2 = "5678";
        account.setPin(correctPin2);
        account.withdraw(5_000_000,correctPin2);
        assertEquals(5_000_000,account.checkBalance(correctPin2));
    }

    @Test
    public void testThatAccountClassCanUpdatePin(){
        String oldPin = "1234";
        account.setPin(oldPin);
        String newPin = "5678";
        account.updatePin(oldPin,newPin);
        account.setPin(newPin);
        account.deposit(1_000);
        assertEquals(1_000,account.checkBalance(newPin));
        account.withdraw(500,newPin);
        assertEquals(500,account.checkBalance(newPin));
    }

    @Test
    public void testThatAccountClassCanReturnAccountNumber(){
        account.setAccountNumber("1");
        account.getAccountNumber();
        assertEquals("1", account.getAccountNumber());
    }
}
