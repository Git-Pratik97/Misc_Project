package com.example.tripPlanner.service;

import com.example.tripPlanner.dto.PlanDTO;
import com.example.tripPlanner.entity.Plan;
import com.example.tripPlanner.exception.InvalidPlanException;
import com.example.tripPlanner.repository.PlanDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class IPlanServiceImpl implements IPlanService{

    @Autowired
    PlanDAO planDAO;

    public String createPlan(PlanDTO planDTO) throws InvalidPlanException {
        Optional<Plan> optionalPlan = planDAO.findById(planDTO.getId());
        if(optionalPlan.isPresent()) {
            throw new InvalidPlanException("Plan already present...!");
        }

        Plan plan = new Plan();
        plan.setId(planDTO.getId());
        plan.setCreated_by(planDTO.getCreated_by());
        plan.setCreated_at(planDTO.getCreated_at());
        plan.setDate(planDTO.getDate());
        plan.setStatus(planDTO.getStatus());
        plan.setPlace(planDTO.getPlace());

        planDAO.save(plan);

        return "New Plan Created Successfully.";


    }

    @Override
    public List<PlanDTO> getAllPlans() throws InvalidPlanException {
        List<Plan> plans = planDAO.findAll();
        if(plans.isEmpty()) {
            throw new InvalidPlanException("No plan is present");
        }

        List<PlanDTO> planDTOS = new ArrayList<>();

        plans.forEach(plan -> {
            PlanDTO planDTO = plan.toPlanDTO();
            planDTOS.add(planDTO);
        });

        return planDTOS;
    }

    @Override
    public String updatePlan(PlanDTO planDTO) throws InvalidPlanException {
        return null;
    }

    @Override
    public String removePlan(long id) throws InvalidPlanException {
        return null;
    }

    @Override
    public PlanDTO findPlanByDate(Date date) throws InvalidPlanException {
        return null;
    }

    @Override
    public PlanDTO findPlanByStatus(String status) throws InvalidPlanException {
        return null;
    }


}
