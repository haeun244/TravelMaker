package com.acon.travelmaker.vo;

import org.apache.ibatis.type.Alias;

@Alias("Member")
public class Member {
	
	String id;
	String passwd;
	String name;
	String email;
	String phone;
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String id, String passwd, String name, String email, String phone) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", passwd=" + passwd + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ "]";
	}

	
	
}
