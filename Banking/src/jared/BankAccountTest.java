package jared;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount account;
    @org.junit.jupiter.api.BeforeEach
    void setup() {
        account = new BankAccount("Jared", "beach", 1000.00, BankAccount.CHECKING);
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        assertEquals(1000.00, account.getBalance(), 0);
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        assertEquals(1000.00, account.getBalance(), 0);
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        double balance = account.withdraw(200.00, true);
        assertEquals(800.00, balance, 0);
    }

    @org.junit.jupiter.api.Test
    void isChecking_true() {
        assertTrue(account.isChecking());
    }

    @org.junit.jupiter.api.Test
    void isChecking_false() {
        account = new BankAccount("Jared", "beach", 1000.00, BankAccount.SAVINGS);
        assertFalse(account.isChecking());
    }
}