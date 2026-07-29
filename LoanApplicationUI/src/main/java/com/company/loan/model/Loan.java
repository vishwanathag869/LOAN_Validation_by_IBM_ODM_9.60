package com.company.loan.model;
import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Loan { private String loanId,loanType; private LoanDetails details; private Collateral collateral; public String getLoanId(){return loanId;} public void setLoanId(String v){loanId=v;} public String getLoanType(){return loanType;} public void setLoanType(String v){loanType=v;} public LoanDetails getDetails(){return details;} public void setDetails(LoanDetails v){details=v;} public Collateral getCollateral(){return collateral;} public void setCollateral(Collateral v){collateral=v;} }
