package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    CashMachine[] cashMachines = new CashMachine[]{
            new CashMachine(1000),
            new CashMachine(2000),
            new CashMachine(3000),
            new CashMachine(2000),
    };

    @Test
    public void shouldGetBalanceWhenNoCashMachines() {
        Bank bank = new Bank(new CashMachine[0]);
        assertEquals(0, bank.getBalance());
    }

    @Test
    public void shouldGetBalanceWhenCashMachines() {
        Bank bank = new Bank(cashMachines);
        assertEquals(8000, bank.getBalance());
    }

    @Test
    public void shouldGetNumOfWithdrawalsWhenZero() {
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getNumOfWithdrawals());
    }

    @Test
    public void shouldGetNumOfWithdrawals() {
        Bank bank = new Bank(cashMachines);
        cashMachines[0].withdrawal(100);
        cashMachines[2].withdrawal(100);
        assertEquals(2, bank.getNumOfWithdrawals());
    }

    @Test
    public void shouldGetNumOfDepositsWhenZero() {
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getNumOfDeposits());
    }

    @Test
    public void shouldGetNumOfDeposits() {
        Bank bank = new Bank(cashMachines);
        cashMachines[0].deposit(100);
        cashMachines[2].deposit(100);
        assertEquals(2, bank.getNumOfDeposits());
    }

    @Test
    public void shouldCalculateAverageOfWithdrawalsWhenZero() {
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getMeanWithdrawals(), 0.001);
    }

    @Test
    public void shouldCalculateMeanOfWithdrawalsWhenMoreThanZero() {
        Bank bank = new Bank(cashMachines);
        cashMachines[0].withdrawal(100);
        cashMachines[0].withdrawal(110);
        cashMachines[0].withdrawal(200);
        assertEquals(136.6667, bank.getMeanWithdrawals(), 0.001);
    }

    @Test
    public void shouldCalculateMeanOfDepositsWhenZero() {
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getMeanWithdrawals(), 0.001);
    }

    @Test
    public void shouldCalculateMeanOfDepositsWhenMoreThanZero() {
        Bank bank = new Bank(cashMachines);
        cashMachines[0].deposit(100);
        cashMachines[0].deposit(110);
        cashMachines[1].deposit(200);
        assertEquals(136.6667, bank.getMeanDeposits(), 0.001);
    }
}