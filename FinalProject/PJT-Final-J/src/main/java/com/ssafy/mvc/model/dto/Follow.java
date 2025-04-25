package com.ssafy.mvc.model.dto;

public class Follow {
	private int fromUSeq;
	private int toUSeq;
	public Follow() {
	}
	public Follow(int fromUSeq, int toUSeq) {
		this.fromUSeq = fromUSeq;
		this.toUSeq = toUSeq;
	}
	public int getFromUSeq() {
		return fromUSeq;
	}
	public void setFromUSeq(int fromUSeq) {
		this.fromUSeq = fromUSeq;
	}
	public int getToUSeq() {
		return toUSeq;
	}
	public void setToUSeq(int toUSeq) {
		this.toUSeq = toUSeq;
	}
	@Override
	public String toString() {
		return "Follow [fromUSeq=" + fromUSeq + ", toUSeq=" + toUSeq + "]";
	}
}