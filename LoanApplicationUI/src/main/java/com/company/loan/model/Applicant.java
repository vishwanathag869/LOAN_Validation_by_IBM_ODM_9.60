package com.company.loan.model;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Applicant {
    private String applicantId, firstName, lastName, gender;
    private Integer age;
    private ApplicantDetails details;
    private Employment employment;
    private Income income;
    private Address address;
    private CreditHistory creditHistory;
    private BankDetails bankDetails;
    public String getApplicantId(){return applicantId;} public void setApplicantId(String v){applicantId=v;}
    public String getFirstName(){return firstName;} public void setFirstName(String v){firstName=v;}
    public String getLastName(){return lastName;} public void setLastName(String v){lastName=v;}
    public String getGender(){return gender;} public void setGender(String v){gender=v;}
    public Integer getAge(){return age;} public void setAge(Integer v){age=v;}
    public ApplicantDetails getDetails(){return details;} public void setDetails(ApplicantDetails v){details=v;}
    public Employment getEmployment(){return employment;} public void setEmployment(Employment v){employment=v;}
    public Income getIncome(){return income;} public void setIncome(Income v){income=v;}
    public Address getAddress(){return address;} public void setAddress(Address v){address=v;}
    public CreditHistory getCreditHistory(){return creditHistory;} public void setCreditHistory(CreditHistory v){creditHistory=v;}
    public BankDetails getBankDetails(){return bankDetails;} public void setBankDetails(BankDetails v){bankDetails=v;}
}
