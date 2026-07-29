package com.company.loan.model;
import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanDetails { private Long loanAmount; private Integer tenureMonths; private Double interestRate; private String purpose,repaymentType; public Long getLoanAmount(){return loanAmount;} public void setLoanAmount(Long v){loanAmount=v;} public Integer getTenureMonths(){return tenureMonths;} public void setTenureMonths(Integer v){tenureMonths=v;} public Double getInterestRate(){return interestRate;} public void setInterestRate(Double v){interestRate=v;} public String getPurpose(){return purpose;} public void setPurpose(String v){purpose=v;} public String getRepaymentType(){return repaymentType;} public void setRepaymentType(String v){repaymentType=v;} }
