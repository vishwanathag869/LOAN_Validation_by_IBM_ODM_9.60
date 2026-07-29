package com.company.loan.model;

public class LoanApplication {
    private Applicant applicant;
    private Loan loan;
    private ValidationResult validationResult;

    public Applicant getApplicant() { return applicant; }
    public void setApplicant(Applicant applicant) { this.applicant=applicant; }
    public Loan getLoan() { return loan; }
    public void setLoan(Loan loan) { this.loan=loan; }
    public ValidationResult getValidationResult() { return validationResult; }
    public void setValidationResult(ValidationResult validationResult) { this.validationResult=validationResult; }
}
