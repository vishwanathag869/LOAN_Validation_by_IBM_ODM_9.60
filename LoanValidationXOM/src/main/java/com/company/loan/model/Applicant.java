package com.company.loan.model;

public class Applicant {
    private String applicantId;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private ApplicantDetails details;
    private Employment employment;
    private Address address;
    private CreditHistory creditHistory;
    private Income income;
    private BankAccount bankAccount;

    public String getApplicantId() { return applicantId; }
    public void setApplicantId(String applicantId) { this.applicantId=applicantId; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName=firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName=lastName; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age=age; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender=gender; }
    public ApplicantDetails getDetails() { return details; }
    public void setDetails(ApplicantDetails details) { this.details=details; }
    public Employment getEmployment() { return employment; }
    public void setEmployment(Employment employment) { this.employment=employment; }
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address=address; }
    public CreditHistory getCreditHistory() { return creditHistory; }
    public void setCreditHistory(CreditHistory creditHistory) { this.creditHistory=creditHistory; }
    public Income getIncome() { return income; }
    public void setIncome(Income income) { this.income=income; }
    public BankAccount getBankAccount() { return bankAccount; }
    public void setBankAccount(BankAccount bankAccount) { this.bankAccount=bankAccount; }
}
