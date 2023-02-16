package com.example.tripPlanner.repository;

import com.example.tripPlanner.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface PlanDAO extends JpaRepository {

    public Plan findPlanByDate(Date date);

    List<Plan> findPlanByStatus(String status);

}
