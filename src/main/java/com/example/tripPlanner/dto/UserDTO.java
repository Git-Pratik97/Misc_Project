package com.example.tripPlanner.dto;

import java.util.Date;

public class UserDTO {
    private long emp_id;
    private String name;
    private String phone;
    private String availability;
    private String cancellation_reason;

    public UserDTO() {
    }

    public UserDTO(long emp_id, String name, String phone, String availability, String cancellation_reason) {
        this.emp_id = emp_id;
        this.name = name;
        this.phone = phone;
        this.availability = availability;
        this.cancellation_reason = cancellation_reason;
    }

    public long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getCancellation_reason() {
        return cancellation_reason;
    }

    public void setCancellation_reason(String cancellation_reason) {
        this.cancellation_reason = cancellation_reason;
    }
}
