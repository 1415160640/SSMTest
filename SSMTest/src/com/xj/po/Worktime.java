package com.xj.po;

public class Worktime {
    private Integer id;

    private Integer aid;

    private Double total;
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

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

	@Override
	public String toString() {
		return "Worktime [id=" + id + ", aid=" + aid + ", total=" + total + ", user=" + user + "]";
	}
    
}