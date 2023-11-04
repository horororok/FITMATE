package com.ssafy.ssafit.model.dto;

public class Comment {
	
	private int comment_seq;
	private String content;
	private String created_at;
	private int user_seq;
	private int sportsboard_seq;
	
	public Comment() {	
	}

	public Comment(int comment_seq, String content, String created_at, int user_seq, int sportsboard_seq) {
		super();
		this.comment_seq = comment_seq;
		this.content = content;
		this.created_at = created_at;
		this.user_seq = user_seq;
		this.sportsboard_seq = sportsboard_seq;
	}

	public int getComment_seq() {
		return comment_seq;
	}

	public void setComment_seq(int comment_seq) {
		this.comment_seq = comment_seq;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public int getUser_seq() {
		return user_seq;
	}

	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}

	public int getSportsboard_seq() {
		return sportsboard_seq;
	}

	public void setSportsboard_seq(int sportsboard_seq) {
		this.sportsboard_seq = sportsboard_seq;
	}

	@Override
	public String toString() {
		return "Comment [comment_seq=" + comment_seq + ", content=" + content + ", created_at=" + created_at
				+ ", user_seq=" + user_seq + ", sportsboard_seq=" + sportsboard_seq + "]";
	}
	
	
	
}
