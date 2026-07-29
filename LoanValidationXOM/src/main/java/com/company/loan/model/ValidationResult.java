package com.company.loan.model;

import java.util.ArrayList;
import java.util.List;

public class ValidationResult {
    private boolean eligible;
    private String decision;
    private List<String> messages = new ArrayList<>();

    public boolean isEligible(){return eligible;}
    public void setEligible(boolean eligible){this.eligible=eligible;}
    public String getDecision(){return decision;}
    public void setDecision(String decision){this.decision=decision;}
    public List<String> getMessages(){return messages;}
    public void addMessage(String message){messages.add(message);}
}
