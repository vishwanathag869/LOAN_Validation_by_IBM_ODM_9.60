package com.company.loan.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanApplication {
    private Applicant applicant;
    private Loan loan;
    public Applicant getApplicant() { return applicant; }
    public void setApplicant(Applicant applicant) { this.applicant = applicant; }
    public Loan getLoan() { return loan; }
    public void setLoan(Loan loan) { this.loan = loan; }
}
