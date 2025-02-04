package bankapp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account account = new Account(1,"Edwin Aboje","12345");

    @BeforeEach
    public void startwith() {
        Account account = new Account(1, "Edwin Aboje","12345");
    }

    @Test
    public void testThatAccountClassCanDepositWithCorrectPin() {
        account.deposit(10_000);
        assertEquals(10_000,account.checkBalance("12345"));
    }

    @Test
    public void testThatAccountClassCanNotDepositWithNegetiveOrZeroIntegers(){
        assertThrows(IllegalArgumentException.class, () -> account
                .deposit(0));
    }

    @Test
    public void testThatAccountClassCanWithdraw() {
        account.deposit(10_000);
        assertEquals(10_000,account.checkBalance("12345"));
        String correctPin2 = "5678";
        account.withdraw(5_000,"12345");
        assertEquals(5_000,account.checkBalance("12345"));
    }

    @Test
    public void testThatAccountClassCannotWithdrawZeroNegativeAndHandlesIncorrectPinExceptions() {
        String incorrectPin = "5678";
        account.setPin(incorrectPin);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(0,incorrectPin ));
    }

    @Test
    public void testThatAccountClassReturnsCorrectName(){
        account.setName("Aboje Edwin");
        assertEquals("Aboje Edwin",account.getName());

    }
    @Test
    public void testThatAccountClassCanDepositWithdrawAndReturnCorrectBalance() {
        account.deposit(10_000_000);
        assertEquals(10_000_000,account.checkBalance("12345"));
        account.withdraw(5_000_000,"12345");
        assertEquals(5_000_000,account.checkBalance("12345"));
    }

    @Test
    public void testThatAccountClassCanUpdatePin(){
        String newPin = "5678";
        account.updatePin("12345",newPin);
        account.setPin(newPin);
        account.deposit(1_000);
        assertEquals(1_000,account.checkBalance(newPin));
        account.withdraw(500,newPin);
        assertEquals(500,account.checkBalance(newPin));
    }

    @Test
    public void testThatAccountClassCanReturnAccountNumber(){
        Account account = new Account(1,"Edwin Aboje","12345");
        assertEquals(1, account.getAccountNumber());
    }

}
