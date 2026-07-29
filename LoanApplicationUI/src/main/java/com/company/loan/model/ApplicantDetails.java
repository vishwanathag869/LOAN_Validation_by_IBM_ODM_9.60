package com.company.loan.model;
import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicantDetails { private String pan,aadhaar,maritalStatus; private Integer dependents; private Boolean existingCustomer;
 public String getPan(){return pan;} public void setPan(String v){pan=v;} public String getAadhaar(){return aadhaar;} public void setAadhaar(String v){aadhaar=v;} public String getMaritalStatus(){return maritalStatus;} public void setMaritalStatus(String v){maritalStatus=v;} public Integer getDependents(){return dependents;} public void setDependents(Integer v){dependents=v;} public Boolean getExistingCustomer(){return existingCustomer;} public void setExistingCustomer(Boolean v){existingCustomer=v;} }
