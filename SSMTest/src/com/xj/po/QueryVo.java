package com.xj.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class QueryVo {
	
	private Integer newcate;
	private String newname;
	private Integer newallowance;
	private Integer newuser;
	private Integer newyear;
	private Integer newmonth;
	//当前页
	private Integer page=1;
	//每页数
	private Integer size = 10; 
	//开始行
	private Integer startRow = 0;
	
	public Integer getNewyear() {
		return newyear;
	}
	public void setNewyear(Integer newyear) {
		this.newyear = newyear;
	}
	public Integer getNewmonth() {
		return newmonth;
	}
	public void setNewmonth(Integer newmonth) {
		this.newmonth = newmonth;
	}
	public Integer getNewallowance() {
		return newallowance;
	}
	public void setNewallowance(Integer newallowance) {
		this.newallowance = newallowance;
	}
	public Integer getNewuser() {
		return newuser;
	}
	public void setNewuser(Integer newuser) {
		this.newuser = newuser;
	}
	public Integer getNewcate() {
		return newcate;
	}
	public void setNewcate(Integer newcate) {
		this.newcate = newcate;
	}
	public String getNewname() {
		return newname;
	}
	public void setNewname(String newname) {
		this.newname = newname;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getStartRow() {
		return startRow;
	}
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	
	
	
	
	
	

}
