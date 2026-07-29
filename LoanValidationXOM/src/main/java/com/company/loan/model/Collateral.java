package com.company.loan.model;

public class Collateral {
    private String collateralType;
    private double marketValue;
    private boolean verified;

    public String getCollateralType() { return collateralType; }
    public void setCollateralType(String collateralType) { this.collateralType=collateralType; }
    public double getMarketValue() { return marketValue; }
    public void setMarketValue(double marketValue) { this.marketValue=marketValue; }
    public boolean isVerified() { return verified; }
    public void setVerified(boolean verified) { this.verified=verified; }
}
