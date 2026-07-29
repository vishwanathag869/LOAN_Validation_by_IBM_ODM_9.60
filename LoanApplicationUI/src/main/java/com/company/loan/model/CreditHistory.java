package com.company.loan.model;
import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreditHistory { private Integer creditScore,activeLoans; private Long outstandingAmount; private Boolean loanDefault; public Integer getCreditScore(){return creditScore;} public void setCreditScore(Integer v){creditScore=v;} public Integer getActiveLoans(){return activeLoans;} public void setActiveLoans(Integer v){activeLoans=v;} public Long getOutstandingAmount(){return outstandingAmount;} public void setOutstandingAmount(Long v){outstandingAmount=v;} public Boolean getLoanDefault(){return loanDefault;} public void setLoanDefault(Boolean v){loanDefault=v;} }
