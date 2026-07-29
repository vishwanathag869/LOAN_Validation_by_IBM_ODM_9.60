package com.company.loan.model;

public class BankAccount {
    private String accountNumber;
    private String bankName;
    private String accountType;
    private double balance;

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber=accountNumber; }
    public String getBankName() { return bankName; }
    public void setBankName(String bankName) { this.bankName=bankName; }
    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType=accountType; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance=balance; }
}
