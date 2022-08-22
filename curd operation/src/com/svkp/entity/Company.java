package com.svkp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Company")
public class Company {
	@Id
	@Column(name="Cid")
	public int cid;
	@Column(name="Cname")
	public String cname;
	@Column(name="Cprod")
	public String cprod;
	@Column(name="price")
	public int price;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String Cname) {
		this.cname = cname;
	}
	public String getCprod() {
		return cprod;
	}
	public void setCprod(String cprod) {
		this.cprod = cprod;
	}
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
   
}