package com.company.loan.model;
import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BankDetails { private String bankName,accountNumber,accountType; private Long balance; public String getBankName(){return bankName;} public void setBankName(String v){bankName=v;} public String getAccountNumber(){return accountNumber;} public void setAccountNumber(String v){accountNumber=v;} public String getAccountType(){return accountType;} public void setAccountType(String v){accountType=v;} public Long getBalance(){return balance;} public void setBalance(Long v){balance=v;} }
