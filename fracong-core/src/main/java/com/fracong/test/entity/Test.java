package com.fracong.test.entity;

import java.io.Serializable;

public class Test implements Serializable{
	private static final long serialVersionUID = -6174452579341655671L;

	private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}