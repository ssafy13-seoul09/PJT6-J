package com.ssafy.mvc.model.dto;

public class File {
	private int articleId;
	private String img;
	private String orgImg;
	public File() {
	}
	public File(int articleId, String img, String orgImg) {
		this.articleId = articleId;
		this.img = img;
		this.orgImg = orgImg;
	}
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getOrgImg() {
		return orgImg;
	}
	public void setOrgImg(String orgImg) {
		this.orgImg = orgImg;
	}
	@Override
	public String toString() {
		return "File [articleId=" + articleId + ", img=" + img + ", orgImg=" + orgImg + "]";
	}
}