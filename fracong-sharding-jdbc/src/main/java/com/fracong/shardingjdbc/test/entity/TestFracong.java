package com.fracong.shardingjdbc.test.entity;

import java.io.Serializable;

public class TestFracong implements Serializable{
	private static final long serialVersionUID = 4745819060379036502L;

	private Integer id;

    private String name;

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
}