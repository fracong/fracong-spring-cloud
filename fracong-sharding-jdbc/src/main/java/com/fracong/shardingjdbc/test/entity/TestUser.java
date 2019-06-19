package com.fracong.shardingjdbc.test.entity;

import java.io.Serializable;

public class TestUser implements Serializable{

	private static final long serialVersionUID = -4879306270501155624L;

	private Integer id;

    private Integer sex;

    private String name;
    
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}