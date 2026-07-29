package com.company.loan.model;

public class Employment {
    private String employerName;
    private String employmentType;
    private int experienceYears;
    private boolean salaried;
    private String designation;

    public String getEmployerName() { return employerName; }
    public void setEmployerName(String employerName) { this.employerName=employerName; }
    public String getEmploymentType() { return employmentType; }
    public void setEmploymentType(String employmentType) { this.employmentType=employmentType; }
    public int getExperienceYears() { return experienceYears; }
    public void setExperienceYears(int experienceYears) { this.experienceYears=experienceYears; }
    public boolean isSalaried() { return salaried; }
    public void setSalaried(boolean salaried) { this.salaried=salaried; }
    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation=designation; }
}
