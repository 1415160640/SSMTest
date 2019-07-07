package com.xj.po;

import java.util.List;

public class Money {
	private User user;
	private Cate cate;
	private Workday day;
	private double daymoney;
	private Worktime worktime;
	private double worktimemoney;
	private List<Spring> spring1;
	private double springmoney;
	private double yingfa;
	private double shifa;
	
	
	public double getYingfa() {
		return yingfa;
	}
	public void setYingfa(double yingfa) {
		this.yingfa = yingfa;
	}
	public double getShifa() {
		return shifa;
	}
	public void setShifa(double shifa) {
		this.shifa = shifa;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Cate getCate() {
		return cate;
	}
	public void setCate(Cate cate) {
		this.cate = cate;
	}
	public Workday getDay() {
		return day;
	}
	public void setDay(Workday day) {
		this.day = day;
	}
	public double getDaymoney() {
		return daymoney;
	}
	public void setDaymoney(double daymoney) {
		this.daymoney = daymoney;
	}
	public Worktime getWorktime() {
		return worktime;
	}
	public void setWorktime(Worktime worktime) {
		this.worktime = worktime;
	}
	public double getWorktimemoney() {
		return worktimemoney;
	}
	public void setWorktimemoney(double worktimemoney) {
		this.worktimemoney = worktimemoney;
	}
	
	public List<Spring> getSpring1() {
		return spring1;
	}
	public void setSpring1(List<Spring> spring1) {
		this.spring1 = spring1;
	}
	public double getSpringmoney() {
		return springmoney;
	}
	public void setSpringmoney(double springmoney) {
		this.springmoney = springmoney;
	}
	@Override
	public String toString() {
		return "Money [user=" + user + ", cate=" + cate + ", day=" + day + ", daymoney=" + daymoney + ", worktime="
				+ worktime + ", worktimemoney=" + worktimemoney + ", spring=" + spring1 + ", springmoney=" + springmoney
				+ ", yingfa=" + yingfa + ", shifa=" + shifa + "]";
	}

	
	
	
	

}
