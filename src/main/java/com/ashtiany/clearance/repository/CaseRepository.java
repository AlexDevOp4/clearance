package com.ashtiany.clearance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashtiany.clearance.model.Case;

@Repository
public interface CaseRepository extends JpaRepository<Case, Long> {

    
}
