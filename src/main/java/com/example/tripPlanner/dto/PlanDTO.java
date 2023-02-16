package com.example.tripPlanner.dto;

import com.example.tripPlanner.entity.Plan;

import java.sql.Time;
import java.util.Date;

public class PlanDTO {
    private long id;
    private Date date;
    private String place;
    private Time created_at;
    private String status;
    private String created_by;

    public PlanDTO() {
    }

    public PlanDTO(long id, Date date, String place, Time created_at, String status, String created_by) {
        this.id = id;
        this.date = date;
        this.place = place;
        this.created_at = created_at;
        this.status = status;
        this.created_by = created_by;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Time getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Time created_at) {
        this.created_at = created_at;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Plan toPlan() {
        Plan plan = new Plan();
        plan.setId(this.id);
        plan.setCreated_at(this.created_at);
        plan.setPlace(this.place);
        plan.setStatus(this.status);
        plan.setDate(this.date);
        plan.setCreated_by(this.created_by);

        return plan;
    }
}

