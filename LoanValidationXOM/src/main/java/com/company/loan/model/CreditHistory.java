package com.company.loan.model;

public class CreditHistory {
    private int creditScore;
    private int activeLoans;
    private boolean loanDefault;
    private double outstandingAmount;

    public int getCreditScore() { return creditScore; }
    public void setCreditScore(int creditScore) { this.creditScore=creditScore; }
    public int getActiveLoans() { return activeLoans; }
    public void setActiveLoans(int activeLoans) { this.activeLoans=activeLoans; }
    public boolean isLoanDefault() { return loanDefault; }
    public void setLoanDefault(boolean loanDefault) { this.loanDefault=loanDefault; }
    public double getOutstandingAmount() { return outstandingAmount; }
    public void setOutstandingAmount(double outstandingAmount) { this.outstandingAmount=outstandingAmount; }
}
