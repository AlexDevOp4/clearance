package com.ashtiany.clearance.model;

import com.ashtiany.clearance.model.ClearanceLevel;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "cases")
public class Case {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "First name cannot be blank")
    @Column(nullable = false)
    private String subjectFirstName;
    @NotBlank(message = "Last name cannot be blank")
    @Column(nullable = false)
    private String subjectLastName;
    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ClearanceLevel clearanceLevel;
    private LocalDateTime createdAt;
    private LocalDateTime closedDate;
    @NotBlank(message = "Assigned to cannot be blank")
    @Column(nullable = false)
    private String assignedTo;

    public Case() {
    }


    public Long getId() {
        return id;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getClosedDate() {
        return closedDate;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setId(Long id) {
    this.id = id;
    }   


    public void setSubjectFirstName(String newSubjectFirstName) {
        this.subjectFirstName = newSubjectFirstName;
    }

    public void setSubjectLastName(String newSubjectLastName) {
        this.subjectLastName = newSubjectLastName;
    }

    public void setClearanceLevel(ClearanceLevel clearanceLevel) {
    this.clearanceLevel = clearanceLevel;
    }


    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setClosedDate(LocalDateTime closedDate) {
        this.closedDate = closedDate;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }


}
