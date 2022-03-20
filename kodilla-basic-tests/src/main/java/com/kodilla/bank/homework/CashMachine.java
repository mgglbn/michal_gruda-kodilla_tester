package com.kodilla.bank.homework;

public class CashMachine {
    private int [] transactions;
    private int balance;
    private final int maxMoney=100000;

    public CashMachine(int balance) {
        this.transactions = new int[0];

        if(balance<0){
            this.balance=0;
        }else {
            this.balance = balance;
        }
    }

    public int getBalance(){
        return balance;
    }

    public int getNumOfTransactions(){
        return transactions.length;
    }

    public boolean withdrawal(int value){
        if (value>0 & value <balance & value%10==0){
            balance-=value;
            addTransaction(-value);
            return true;
        }else
        {
            return false;
        }
    }

    public boolean deposit(int value){
        if (value>0 & value%10==0 & balance + value<=maxMoney) {
            balance+=value;
            addTransaction(value);
            return true;
        }else
        {
            return false;
        }
    }

    public int getNumOfWithdrawals(){
        int count=0;
        for(int value : transactions){
            if (value<0){
                count++;
            }
        }
        return count;
    }

    public int getNumOfDeposits(){
        int count=0;
        for(int value : transactions){
            if (value>0){
                count++;
            }
        }
        return count;
    }

    public double getSumOFWithdrawals() {
        int sum = 0;
        for (int value : transactions) {
            if (value < 0) {
                sum += value;
            }
        }
        return -sum;
    }

    public double getSumOfDeposits() {
        int sum = 0;
        for (int value : transactions) {
            if (value > 0) {
                sum += value;
            }
        }
        return sum;
    }

    private void addTransaction(int value) {
        int[] newTransactionsArray=new int[transactions.length+1];

        System.arraycopy(transactions,0,newTransactionsArray,0,transactions.length);
        newTransactionsArray[newTransactionsArray.length-1]= value;
        this.transactions=newTransactionsArray;
    }
}