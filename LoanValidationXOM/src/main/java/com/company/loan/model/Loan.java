package com.company.loan.model;

public class Loan {
    private String loanId;
    private String loanType;
    private LoanDetails details;
    private Collateral collateral;

    public String getLoanId() { return loanId; }
    public void setLoanId(String loanId) { this.loanId=loanId; }
    public String getLoanType() { return loanType; }
    public void setLoanType(String loanType) { this.loanType=loanType; }
    public LoanDetails getDetails() { return details; }
    public void setDetails(LoanDetails details) { this.details=details; }
    public Collateral getCollateral() { return collateral; }
    public void setCollateral(Collateral collateral) { this.collateral=collateral; }
}
