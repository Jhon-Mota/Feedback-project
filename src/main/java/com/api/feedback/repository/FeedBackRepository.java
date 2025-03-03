package com.api.feedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.feedback.models.EmployeeModel;

@Repository
public interface FeedBackRepository extends JpaRepository<Long, EmployeeModel> {

}
