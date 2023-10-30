package com.ssafy.ssafit.model.dto;

public class Board {
	private int sportsboard_seq;
	private String title; //제목
	private String content; //내용
	private String created_at; //등록 날짜
	private int view_cnt; //조회수
	private int user_seq; //작성자
	
	public Board() {}

	public Board(int sportsboard_seq, String title, String content, String created_at, int view_cnt, int user_seq) {
		this.sportsboard_seq = sportsboard_seq;
		this.title = title;
		this.content = content;
		this.created_at = created_at;
		this.view_cnt = view_cnt;
		this.user_seq = user_seq;
	}

	public int getSportsboard_seq() {
		return sportsboard_seq;
	}

	public void setSportsboard_seq(int sportsboard_seq) {
		this.sportsboard_seq = sportsboard_seq;
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

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public int getView_cnt() {
		return view_cnt;
	}

	public void setView_cnt(int view_cnt) {
		this.view_cnt = view_cnt;
	}

	public int getUser_seq() {
		return user_seq;
	}

	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}

	@Override
	public String toString() {
		return "Board [sportsboard_seq=" + sportsboard_seq + ", title=" + title + ", content=" + content
				+ ", created_at=" + created_at + ", view_cnt=" + view_cnt + ", user_seq=" + user_seq + "]";
	}

	
}