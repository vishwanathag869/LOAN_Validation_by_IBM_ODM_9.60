package com.company.loan.model;
import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Income { private Long monthlyIncome,annualIncome,otherIncome; public Long getMonthlyIncome(){return monthlyIncome;} public void setMonthlyIncome(Long v){monthlyIncome=v;} public Long getAnnualIncome(){return annualIncome;} public void setAnnualIncome(Long v){annualIncome=v;} public Long getOtherIncome(){return otherIncome;} public void setOtherIncome(Long v){otherIncome=v;} }
