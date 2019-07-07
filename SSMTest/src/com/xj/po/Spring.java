package com.xj.po;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Spring {
    private Integer id;

    private Date date;

    private Integer uid;

    private Integer aid;
    private User user;
    private Allowance allowance;
    
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Allowance getAllowance() {
		return allowance;
	}

	public void setAllowance(Allowance allowance) {
		this.allowance = allowance;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

	@Override
	public String toString() {
		return "Spring [id=" + id + ", date=" + date + ", uid=" + uid + ", aid=" + aid + ", user=" + user
				+ ", allowance=" + allowance + "]";
	}
    
}