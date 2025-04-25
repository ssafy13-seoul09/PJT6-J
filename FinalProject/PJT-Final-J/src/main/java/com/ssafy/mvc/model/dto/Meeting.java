package com.ssafy.mvc.model.dto;

import java.time.LocalDate;

public class Meeting {
	private int meetingId;
	private String title;
	private String content;
	private int uSeq;
	private int limit;
	private LocalDate createdAt;
	public Meeting() {
	}
	public Meeting(String title, String content, int uSeq, int limit, LocalDate createdAt) {
		this.title = title;
		this.content = content;
		this.uSeq = uSeq;
		this.limit = limit;
		this.createdAt = createdAt;
	}
	public int getMeetingId() {
		return meetingId;
	}
	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getuSeq() {
		return uSeq;
	}
	public void setuSeq(int uSeq) {
		this.uSeq = uSeq;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "Meeting [title=" + title + ", content=" + content + ", uSeq=" + uSeq + ", limit=" + limit
				+ ", createdAt=" + createdAt + "]";
	}
	
}