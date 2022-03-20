package com.kodilla.bank.homework;

public class Bank {
    CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public int getBalance() {
        int balance = 0;
        for (CashMachine cashMachine : cashMachines) {
            balance += cashMachine.getBalance();
        }
        return balance;
    }

    public int getNumOfWithdrawals() {
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            count += cashMachine.getNumOfWithdrawals();
        }
        return count;
    }

    public int getNumOfDeposits() {
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            count += cashMachine.getNumOfDeposits();
        }
        return count;
    }

    public double getMeanWithdrawals() {
        if (cashMachines.length == 0) {
            return 0;
        }
        double sum = 0;
        int withdrawals= 0;
        for (CashMachine cashMachine : cashMachines) {
            sum += cashMachine.getSumOFWithdrawals();
            withdrawals+=cashMachine.getNumOfWithdrawals();
        }
        if (withdrawals==0){
            return 0;
        } else{
            return sum/withdrawals;
        }

    }

    public double getMeanDeposits() {
        if (cashMachines.length == 0) {
            return 0;
        }
        double sum = 0;
        int deposits = 0;
        for (CashMachine cashMachine : cashMachines) {
            sum += cashMachine.getSumOfDeposits();
            deposits+=cashMachine.getNumOfDeposits();
        }
        if(deposits==0){
            return 0;
        }else {
            return sum / deposits;
        }
    }
}