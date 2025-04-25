package com.ssafy.mvc.model.dto;

public class Board {
	private int boardId;
	private String title;
	
	public Board() {}
	
	
	
	
	public Board(int boardId, String title) {
		this.boardId = boardId;
		this.title = title;
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
	@Override
	public String toString() {
		return "Board [boardId=" + boardId + ", title=" + title + "]";
	}
	
	
	
}
