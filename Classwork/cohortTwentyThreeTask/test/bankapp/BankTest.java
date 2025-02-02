package bankapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankTest {
    private Bank gtbbank = new Bank("uba");

    @BeforeEach
    public void startwith(){
        Bank gtbbank = new Bank("gtbbank");
    }

    @Test
    public void testThatBankClassCanCreateAccounts(){
        gtbbank.createAccount("Edwin Aboje","12345");
        gtbbank.createAccount("Hannah Jagiri","56789");
    }

    @Test
    public void testThatBankClassCanDeposit(){
        gtbbank.createAccount("Edwin Aboje","12345");
        gtbbank.createAccount("Hannah Jagiri","56789");
        gtbbank.deposit("1",10_000);
        gtbbank.deposit("5",20_000);
    }

    @Test
    public void testThatBankClassHandlesZeroAndNegetiveDepositAmountExceptions(){
        gtbbank.createAccount("Edwin Aboje","12345");
        gtbbank.createAccount("Hannah Jagiri","56789");
        assertThrows(IllegalArgumentException.class ,() -> gtbbank.deposit("1",-10_000));
        assertThrows(IllegalArgumentException.class ,() -> gtbbank.deposit("5",0));
    }

    @Test
    public void testThatBankClassCanDepositAndReturnCorrectAmount(){
        gtbbank.createAccount("Edwin Aboje","12345");
        gtbbank.deposit("1",10_000);
        assertEquals(10_000,gtbbank.checkBalance("1", "12345"));
        gtbbank.createAccount("Hannah Jagiri","56789");
        gtbbank.deposit("2",20_000);
        assertEquals(20_000,gtbbank.checkBalance("2", "56789"));
    }

    @Test
    public void testThatBankClassHandlesAccountExceptionsWhenCheckingBalance(){
        gtbbank.createAccount("Edwin Aboje","12345");
        assertThrows(IllegalArgumentException.class, () -> gtbbank.checkBalance(null,"56789" ));
    }

    @Test
    public void testThatBankClassCanDepositWithDrawAndReturnCorrectBalance(){
        gtbbank.createAccount("Edwin Aboje","12345");
        gtbbank.deposit("1",10_000);
        assertEquals(10_000,gtbbank.checkBalance("1", "12345"));
        gtbbank.withdraw("1",5_000,"12345");
        assertEquals(5_000,gtbbank.checkBalance("1", "12345"));
    }

    @Test
    public void testThatBankClassHandlesWithdrawalExceptions(){
        gtbbank.createAccount("Edwin Aboje","12345");
        gtbbank.deposit("1",10_000);
        assertThrows(IllegalArgumentException.class,() -> gtbbank.withdraw("2",10_000,"56789"));
    }

    @Test
    public void testThatBankCanDepositAndTransferMoneyAndCheckBalance() {
        gtbbank.createAccount("Edwin Aboje","12345");
        gtbbank.deposit("1",10_000);
        gtbbank.createAccount("Hannah Jagiri","56789");
        gtbbank.transfer("1","12345","2",7_000);
        assertEquals(3_000,gtbbank.checkBalance("1", "12345"));
        assertEquals(7_000,gtbbank.checkBalance("2", "56789"));
    }

    @Test
    public void testThatBankHandlesTransferExceptions(){
        gtbbank.createAccount("Edwin Aboje","12345");
        gtbbank.deposit("1",10_000);
        gtbbank.createAccount("Hannah Jagiri","56789");
        gtbbank.transfer("1","12345","2",7_000);

        assertThrows(IllegalArgumentException.class,() -> gtbbank.transfer(null,"12345","2",-7_000));
    }

}
