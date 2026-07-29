package com.company.loan.model;

public class LoanDetails {
    private double loanAmount;
    private int tenureMonths;
    private double interestRate;
    private String purpose;
    private String repaymentType;

    public double getLoanAmount() { return loanAmount; }
    public void setLoanAmount(double loanAmount) { this.loanAmount=loanAmount; }
    public int getTenureMonths() { return tenureMonths; }
    public void setTenureMonths(int tenureMonths) { this.tenureMonths=tenureMonths; }
    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate=interestRate; }
    public String getPurpose() { return purpose; }
    public void setPurpose(String purpose) { this.purpose=purpose; }
    public String getRepaymentType() { return repaymentType; }
    public void setRepaymentType(String repaymentType) { this.repaymentType=repaymentType; }
}
