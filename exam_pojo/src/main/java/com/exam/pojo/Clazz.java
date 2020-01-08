package com.exam.pojo;

import java.io.Serializable;
import java.util.Date;

public class Clazz implements Serializable {
	
	private int cid;
	private String cname;
	private int time;
	private int type;
	private String img;
	private Date date;
	public Clazz() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Clazz [cid=" + cid + ", cname=" + cname + ", time=" + time + ", type=" + type + ", img=" + img
				+ ", date=" + date + "]";
	}
	public Clazz(int cid, String cname, int time, int type, String img, Date date) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.time = time;
		this.type = type;
		this.img = img;
		this.date = date;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

}
