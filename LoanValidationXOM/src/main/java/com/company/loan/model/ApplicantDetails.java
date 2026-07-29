package com.company.loan.model;

public class ApplicantDetails {
    private String panNumber;
    private String aadhaarNumber;
    private String maritalStatus;
    private int dependents;
    private boolean existingCustomer;

    public String getPanNumber() { return panNumber; }
    public void setPanNumber(String panNumber) { this.panNumber=panNumber; }
    public String getAadhaarNumber() { return aadhaarNumber; }
    public void setAadhaarNumber(String aadhaarNumber) { this.aadhaarNumber=aadhaarNumber; }
    public String getMaritalStatus() { return maritalStatus; }
    public void setMaritalStatus(String maritalStatus) { this.maritalStatus=maritalStatus; }
    public int getDependents() { return dependents; }
    public void setDependents(int dependents) { this.dependents=dependents; }
    public boolean isExistingCustomer() { return existingCustomer; }
    public void setExistingCustomer(boolean existingCustomer) { this.existingCustomer=existingCustomer; }
}
