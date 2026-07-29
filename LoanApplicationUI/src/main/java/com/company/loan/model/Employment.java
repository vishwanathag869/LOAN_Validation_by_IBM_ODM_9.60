package com.company.loan.model;
import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employment { private String employer,employmentType,designation; private Integer experienceYears; private Boolean salaried;
 public String getEmployer(){return employer;} public void setEmployer(String v){employer=v;} public String getEmploymentType(){return employmentType;} public void setEmploymentType(String v){employmentType=v;} public String getDesignation(){return designation;} public void setDesignation(String v){designation=v;} public Integer getExperienceYears(){return experienceYears;} public void setExperienceYears(Integer v){experienceYears=v;} public Boolean getSalaried(){return salaried;} public void setSalaried(Boolean v){salaried=v;} }
