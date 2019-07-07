package com.xj.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cate {
    private Integer id;

    private String name;

    private Double salary;

    private Double worktime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getWorktime() {
        return worktime;
    }

    public void setWorktime(Double worktime) {
        this.worktime = worktime;
    }

	@Override
	public String toString() {
		return "Cate [id=" + id + ", name=" + name + ", salary=" + salary + ", worktime=" + worktime + "]";
	}
    
}