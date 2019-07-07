package com.xj.po;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Workday {
    private Integer id;

    private Integer uid;

    private Double total;

    private Date today;
    private User user;
    private Integer state=0;
    
    public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

	@Override
	public String toString() {
		return "Workday [id=" + id + ", uid=" + uid + ", total=" + total + ", today=" + today + ", user=" + user
				+ ", state=" + state + "]";
	}
    
}