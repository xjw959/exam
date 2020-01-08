package com.exam.pojo;

import java.io.Serializable;

public class User implements Serializable {
	
	private int uid;
	private String username;
	private String password;
	private int stuts;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", stuts=" + stuts + "]";
	}
	public User(int uid, String username, String password, int stuts) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.stuts = stuts;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
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
	public int getStuts() {
		return stuts;
	}
	public void setStuts(int stuts) {
		this.stuts = stuts;
	}
	

}
