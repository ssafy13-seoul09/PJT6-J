package com.ssafy.mvc.model.dto;

public class Like {
	private int uSeq;
	private int id;
	private String type;
	public Like() {
	}
	public Like(int uSeq, int id, String type) {
		this.uSeq = uSeq;
		this.id = id;
		this.type = type;
	}
	public int getuSeq() {
		return uSeq;
	}
	public void setuSeq(int uSeq) {
		this.uSeq = uSeq;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Like [uSeq=" + uSeq + ", id=" + id + ", type=" + type + "]";
	}
}