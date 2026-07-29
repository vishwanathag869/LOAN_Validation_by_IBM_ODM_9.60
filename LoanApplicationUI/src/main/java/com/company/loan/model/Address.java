package com.company.loan.model;
import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address { private String houseNo,street,city,state,country,postalCode; public String getHouseNo(){return houseNo;} public void setHouseNo(String v){houseNo=v;} public String getStreet(){return street;} public void setStreet(String v){street=v;} public String getCity(){return city;} public void setCity(String v){city=v;} public String getState(){return state;} public void setState(String v){state=v;} public String getCountry(){return country;} public void setCountry(String v){country=v;} public String getPostalCode(){return postalCode;} public void setPostalCode(String v){postalCode=v;} }
