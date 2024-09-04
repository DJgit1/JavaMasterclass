package com.dj;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }
    @org.junit.Before
    public void setUp() {
        account = new BankAccount("D", "J", 1000, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }
    @org.junit.Test
    public void deposit() {
//        BankAccount account = new BankAccount("D", "J", 1000, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(1200, balance,  0);
    }

    @org.junit.Test
    public void withdraw_branch() {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() {
//        try {
            account.withdraw(600.00, false);
//            fail("Should have thrown an IllegalArgumentException");
//        } catch (IllegalArgumentException e) {
//
//        }

    }

    @org.junit.Test
    public void getBalance_deposit() {
//        BankAccount account = new BankAccount("D", "J", 1000, BankAccount.CHECKING);
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
//        BankAccount account = new BankAccount("D", "J", 1000, BankAccount.CHECKING);
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true() {
//        BankAccount account = new BankAccount("D", "J", 1000, BankAccount.CHECKING);
        assertTrue("The account is not checking account", account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass() {
        System.out.println("This executes after any test cases. Count = " + count++);
    }

    @org.junit.After
    public void tearDown() {
        System.out.println("Count = " + count++);
    }
}

