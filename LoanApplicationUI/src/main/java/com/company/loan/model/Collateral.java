package com.company.loan.model;
import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Collateral { private String collateralType; private Long marketValue; private Boolean verified; public String getCollateralType(){return collateralType;} public void setCollateralType(String v){collateralType=v;} public Long getMarketValue(){return marketValue;} public void setMarketValue(Long v){marketValue=v;} public Boolean getVerified(){return verified;} public void setVerified(Boolean v){verified=v;} }
