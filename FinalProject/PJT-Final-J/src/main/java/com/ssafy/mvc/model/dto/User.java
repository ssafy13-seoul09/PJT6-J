package com.ssafy.mvc.model.dto;

public class User {
	
	private int uSeq;
	private String id;
	private String password;
	private String name;
	private String email;
	private String nickName;
	private String sex;
	private String phone;
	
	public User() {}
	
	
	public User(int uSeq, String id, String password, String name, String email, String nickName, String sex,
			String phone) {
		super();
		this.uSeq = uSeq;
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.nickName = nickName;
		this.sex = sex;
		this.phone = phone;
	}
	
	public int getuSeq() {
		return uSeq;
	}
	public void setuSeq(int uSeq) {
		this.uSeq = uSeq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [uSeq=" + uSeq + ", id=" + id + ", password=" + password + ", name=" + name + ", email=" + email
				+ ", nickName=" + nickName + ", sex=" + sex + ", phone=" + phone + "]";
	}
	
	
	

}
