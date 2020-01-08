package com.exam.pojo;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {

	private int oid;
	private String number;
	private  int cid;
	private double money;
	private Date date;
	private String pople;
	private int stuts;
	private String name;
	private String type;
	private String img;
	private int time;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Order(int oid, String number, int cid, double money, Date date, String pople, int stuts, String name) {
		super();
		this.oid = oid;
		this.number = number;
		this.cid = cid;
		this.money = money;
		this.date = date;
		this.pople = pople;
		this.stuts = stuts;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", number=" + number + ", cid=" + cid + ", money=" + money + ", date=" + date
				+ ", pople=" + pople + ", stuts=" + stuts + ", name=" + name + "]";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPople() {
		return pople;
	}
	public void setPople(String pople) {
		this.pople = pople;
	}
	public int getStuts() {
		return stuts;
	}
	public void setStuts(int stuts) {
		this.stuts = stuts;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	
	
}
