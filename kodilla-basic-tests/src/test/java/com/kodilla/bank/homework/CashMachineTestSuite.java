package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldBeBalanceZero() {
        CashMachine cashMachine = new CashMachine(0);

        assertEquals(0, cashMachine.getBalance());
    }

    @Test
    public void shouldBeBalanceZeroInitializedWithNegative() {
        CashMachine cashMachine = new CashMachine(-1000);

        assertEquals(0, cashMachine.getBalance());
    }

    @Test
    public void shouldBeBalanceMoreThanZero() {
        CashMachine cashMachine = new CashMachine(1000);

        assertEquals(1000, cashMachine.getBalance());
    }

    @Test
    public void shouldBeNumOfTransactionsZero() {
        CashMachine cashMachine = new CashMachine(1000);

        assertEquals(0, cashMachine.getNumOfTransactions());

        cashMachine.withdrawal(0);

        assertEquals(0, cashMachine.getNumOfTransactions());

        cashMachine.deposit(0);

        assertEquals(0, cashMachine.getNumOfTransactions());

        cashMachine.withdrawal(1001);

        assertEquals(0, cashMachine.getNumOfTransactions());
    }

    @Test
    public void shouldBeNumOfTransactionsTwo() {
        CashMachine cashMachine = new CashMachine(1000);
        cashMachine.withdrawal(100);
        cashMachine.deposit(200);

        assertEquals(2, cashMachine.getNumOfTransactions());
    }

    @Test
    public void balanceAndNumOfTransactionsAfterSeriesOfWithdrawals() {
        CashMachine cashMachine = new CashMachine(1000);
        cashMachine.withdrawal(100);
        cashMachine.withdrawal(1150);
        cashMachine.withdrawal(101);
        cashMachine.withdrawal(100);
        cashMachine.withdrawal(0);
        cashMachine.withdrawal(-100);

        assertEquals(800, cashMachine.getBalance());
        assertEquals(2, cashMachine.getNumOfTransactions());
    }

    @Test
    public void balanceAndNumOfTransactionsAfterSeriesOfDeposits() {
        CashMachine cashMachine = new CashMachine(1000);
        cashMachine.deposit(0);
        cashMachine.deposit(-100);
        cashMachine.deposit(99001);
        cashMachine.deposit(101);
        cashMachine.deposit(4000);
        cashMachine.deposit(5000);
        cashMachine.deposit(90000);

        assertEquals(100000, cashMachine.getBalance());
        assertEquals(3, cashMachine.getNumOfTransactions());
    }

    @Test
    public void shouldGetNumberOfWithdrawals() {
        CashMachine cashMachine = new CashMachine(1000);
        cashMachine.withdrawal(0);
        cashMachine.withdrawal(-100);
        cashMachine.withdrawal(2000);
        cashMachine.deposit(3000);
        cashMachine.withdrawal(1000);
        cashMachine.withdrawal(1000);
        cashMachine.withdrawal(1000);

        assertEquals(3, cashMachine.getNumOfWithdrawals());
    }

    @Test
    public void shouldGetNumberOfDeposits() {
        CashMachine cashMachine = new CashMachine(1000);
        cashMachine.deposit(99001);
        cashMachine.deposit(101);
        cashMachine.deposit(-101);
        cashMachine.deposit(0);
        cashMachine.withdrawal(100);
        cashMachine.deposit(10);
        cashMachine.deposit(110);

        assertEquals(2, cashMachine.getNumOfDeposits());
    }

    @Test
    public void shouldBeSumOfWithdrawalsZero() {
        CashMachine cashMachine = new CashMachine(1000);

        assertEquals(0, cashMachine.getSumOfWithdrawals());
    }

    @Test
    public void shouldBeSumOfWithdrawalsWhenMoreThanZero() {
        CashMachine cashMachine = new CashMachine(1000);
        cashMachine.withdrawal(100);
        cashMachine.withdrawal(200);
        cashMachine.withdrawal(110);
        cashMachine.deposit(200);

        assertEquals(410, cashMachine.getSumOfWithdrawals());
    }

    @Test
    public void shouldBeSumOfDepositsZero() {
        CashMachine cashMachine = new CashMachine(1000);
        assertEquals(0, cashMachine.getSumOfDeposits());
    }

    @Test
    public void shouldBeSumOfDepositsWhenMoreThanZero() {
        CashMachine cashMachine = new CashMachine(1000);
        cashMachine.deposit(100);
        cashMachine.deposit(200);
        cashMachine.deposit(110);
        cashMachine.withdrawal(200);

        assertEquals(410, cashMachine.getSumOfDeposits());
    }
}