package com.wangmy.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserEntity implements Serializable {
	private String username;
	private String password;

	public UserEntity() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
