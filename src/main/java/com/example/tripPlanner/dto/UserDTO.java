<<<<<<< HEAD
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
=======
package com.example.tripPlanner.dto;


public class UserDTO {
    private long id;
    private String name;
    private String phonenum;
    private boolean availability;
    private String reason;
    
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	

}
>>>>>>> 36e904d44cbff320583ac76fb32f6015b7c3f8c0
