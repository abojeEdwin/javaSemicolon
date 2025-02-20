package bankapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankTest {
    private Bank gtbbank = new Bank("gtbbank");

    @BeforeEach
    public void startwith(){
        gtbbank = new Bank("gtbbank");
    }

    @Test
    public void testThatBankClassCanCreateAccounts(){
        gtbbank.createAccount("Edwin Aboje","12345");
        gtbbank.createAccount("Hannah Jagiri","56789");
    }

    @Test
    public void testThatBankClassCanDeposit(){
        gtbbank.createAccount("Hannah Jagiri","56789");
        gtbbank.deposit(1,10_000);
        assertEquals(10_000,gtbbank.checkBalance(1,"56789"));
    }

    @Test
    public void testThatBankClassHandlesZeroAndNegetiveDepositAmountExceptions(){
        gtbbank.createAccount("Edwin Aboje","12345");
        gtbbank.createAccount("Hannah Jagiri","56789");
        assertThrows(IllegalArgumentException.class ,() -> gtbbank.deposit(1,-10_000));
    }

    @Test
    public void testThatBankClassCanDepositAndReturnCorrectAmount(){
        gtbbank.createAccount("Edwin Aboje","12345");
        assertEquals(1,gtbbank.getAccountnumber());
        gtbbank.createAccount("Hannah Jagiri","56789");
        assertEquals(2,gtbbank.getAccountnumber());
        gtbbank.deposit(1,10_000);
        assertEquals(10_000,gtbbank.checkBalance(1, "12345"));
        gtbbank.deposit(1,20_000);
        assertEquals(30_000,gtbbank.checkBalance(1, "12345"));
        gtbbank.deposit(1,30_000);
        assertEquals(60_000,gtbbank.checkBalance(1,"12345"));
    }

    @Test
    public void testThatBankClassCanDepositWithDrawAndReturnCorrectBalance(){
        gtbbank.createAccount("Edwin Aboje","12345");
        gtbbank.deposit(1,10_000);
        assertEquals(10_000,gtbbank.checkBalance(1, "12345"));
        gtbbank.withdraw(1,5_000,"12345");
        assertEquals(5_000,gtbbank.checkBalance(1, "12345"));
    }

    @Test
    public void testThatBankClassHandlesWithdrawalExceptions(){
        gtbbank.createAccount("Edwin Aboje","12345");
        gtbbank.deposit(1,10_000);
        assertThrows(IllegalArgumentException.class,() -> gtbbank.withdraw(1,10_000,"56789"));
    }

    @Test
    public void testThatBankCanDepositAndTransferMoneyAndCheckBalance() {
        gtbbank.createAccount("Edwin Aboje","1234");
        gtbbank.deposit(1,10_000);
        assertEquals(1,gtbbank.getAccountnumber());
        gtbbank.createAccount("Hannah Jagiri","5678");
        assertEquals(2,gtbbank.getAccountnumber());
        gtbbank.transfer(1,"1234",2,7_000);
        assertEquals(3_000,gtbbank.checkBalance(1, "1234"));
        assertEquals(7_000,gtbbank.checkBalance(2, "5678"));
    }

    @Test
    public void testThatBankHandlesTransferExceptions(){
        gtbbank.createAccount("edwin","1234");
        gtbbank.deposit(1,10_000);
        assertThrows(IllegalArgumentException.class,() -> gtbbank.transfer(1,"12345",1,7_000));
    }

}
