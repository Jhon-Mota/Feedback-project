package com.api.feedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.feedback.models.ChiefModel;

@Repository
public interface ChiefRepository extends JpaRepository<ChiefModel, Long> {
    
}
