package com.xj.po;

import java.util.Date;

public class Salary {
    private Integer id;

    private Integer uid;

    private Double day;

    private Double daymoney;

    private Double worktime;

    private Double worktimemoney;

    private Integer spring;

    private Double springmoney;

    private Double yingfa;

    private Double shifa;

    private Date date;
    private User user;
    
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

    public Double getDay() {
        return day;
    }

    public void setDay(Double day) {
        this.day = day;
    }

    public Double getDaymoney() {
        return daymoney;
    }

    public void setDaymoney(Double daymoney) {
        this.daymoney = daymoney;
    }

    public Double getWorktime() {
        return worktime;
    }

    public void setWorktime(Double worktime) {
        this.worktime = worktime;
    }

    public Double getWorktimemoney() {
        return worktimemoney;
    }

    public void setWorktimemoney(Double worktimemoney) {
        this.worktimemoney = worktimemoney;
    }

    public Integer getSpring() {
        return spring;
    }

    public void setSpring(Integer spring) {
        this.spring = spring;
    }

    public Double getSpringmoney() {
        return springmoney;
    }

    public void setSpringmoney(Double springmoney) {
        this.springmoney = springmoney;
    }

    public Double getYingfa() {
        return yingfa;
    }

    public void setYingfa(Double yingfa) {
        this.yingfa = yingfa;
    }

    public Double getShifa() {
        return shifa;
    }

    public void setShifa(Double shifa) {
        this.shifa = shifa;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}