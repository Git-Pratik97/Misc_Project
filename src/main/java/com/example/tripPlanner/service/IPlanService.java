package com.example.tripPlanner.service;

import com.example.tripPlanner.dto.PlanDTO;
import com.example.tripPlanner.exception.InvalidPlanException;

import java.util.Date;
import java.util.List;

public interface IPlanService {

    public String createPlan(PlanDTO planDTO) throws InvalidPlanException;
    public List<PlanDTO> getAllPlans() throws InvalidPlanException;
    public String updatePlan(PlanDTO planDTO) throws InvalidPlanException;
    public String removePlan(long id) throws InvalidPlanException;
    public PlanDTO findPlanByDate(Date date) throws InvalidPlanException;
    public PlanDTO findPlanByStatus(String status) throws InvalidPlanException;

}
