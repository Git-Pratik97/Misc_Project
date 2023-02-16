<<<<<<< HEAD
package com.example.tripPlanner.entity;

import com.example.tripPlanner.dto.PlanDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Time;
import java.util.Date;

@Entity
public class Plan {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private long id;
    private Date date;
    private String place;
    private Time created_at;
    private String status;
    private String created_by;

    public Plan() {
    }

    public Plan(long id, Date date, String place, Time created_at, String status, String created_by) {
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

    public PlanDTO toPlanDTO() {
        PlanDTO planDTO = new PlanDTO();
        planDTO.setId(this.id);
        planDTO.setDate(this.date);
        planDTO.setCreated_at(this.created_at);
        planDTO.setPlace(this.place);
        planDTO.setStatus(this.status);
        planDTO.setCreated_by(this.created_by);

        return planDTO;
    }
}
=======
package com.example.tripPlanner.entity;

public class Plan {
}
>>>>>>> 36e904d44cbff320583ac76fb32f6015b7c3f8c0
