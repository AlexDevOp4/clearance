package com.ashtiany.clearance.dto;

import com.ashtiany.clearance.model.ClearanceLevel;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateCaseRequest {
    @NotBlank(message = "Subject first name is required.")
    private String subjectFirstName;
    @NotBlank(message = "Subject last name is required.")
    private String subjectLastName;
    @NotNull
    private ClearanceLevel clearanceLevel;
    @NotBlank(message = "Assigned to is required")
    private String assignedTo;

    public CreateCaseRequest() {
    }
    
    public String getSubjectFirstName() {
        return subjectFirstName;
    }

    public String getSubjectLastName() {
        return subjectLastName;
    }

    public ClearanceLevel getClearanceLevel() {
        return clearanceLevel;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setSubjectFirstName(String newSubjectFirstName) {
        this.subjectFirstName = newSubjectFirstName;
    }
    
    public void setSubjectLastName(String newSubjectLastName) {
        this.subjectLastName = newSubjectLastName;
    }

    public void setClearanceLevel(ClearanceLevel newClearanceLevel) {
        this.clearanceLevel = newClearanceLevel;
    }

    public void setAssignedTo(String newAssignedTo) {
        this.assignedTo = newAssignedTo;
    }
    
}
