package com.ssafy.mvc.model.dto;

import java.time.LocalDate;

public class Article {
	private int articleId;
	private int uSeq;
	private int boardId;
	private String title;
	private String content;
	private LocalDate createdAt;
	private LocalDate modifiedAt;
	private int viewCnt;
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Article(int articleId, int uSeq, int boardId, String title, String content, LocalDate createdAt,
			LocalDate modifiedAt, int viewCnt) {
		super();
		this.articleId = articleId;
		this.uSeq = uSeq;
		this.boardId = boardId;
		this.title = title;
		this.content = content;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
		this.viewCnt = viewCnt;
	}
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public int getuSeq() {
		return uSeq;
	}
	public void setuSeq(int uSeq) {
		this.uSeq = uSeq;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
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
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDate getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(LocalDate modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", uSeq=" + uSeq + ", boardId=" + boardId + ", title=" + title
				+ ", content=" + content + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + ", viewCnt="
				+ viewCnt + "]";
	}
}
