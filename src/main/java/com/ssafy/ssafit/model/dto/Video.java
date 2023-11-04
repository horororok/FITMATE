package com.ssafy.ssafit.model.dto;

public class Video {
	private int video_seq;
	private String title;
	private String url;
	private String channel_name;
	private int view_cnt;
	private String part;
	
	public Video() {}

	public Video(int video_seq, String title, String url, String channel_name, int view_cnt, String part) {
		this.video_seq = video_seq;
		this.title = title;
		this.url = url;
		this.channel_name = channel_name;
		this.view_cnt = view_cnt;
		this.part = part;
	}

	public int getVideo_seq() {
		return video_seq;
	}

	public void setVideo_seq(int video_seq) {
		this.video_seq = video_seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getChannel_name() {
		return channel_name;
	}

	public void setChannel_name(String channel_name) {
		this.channel_name = channel_name;
	}

	public int getView_cnt() {
		return view_cnt;
	}

	public void setView_cnt(int view_cnt) {
		this.view_cnt = view_cnt;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	@Override
	public String toString() {
		return "Video [video_seq=" + video_seq + ", title=" + title + ", url=" + url + ", channel_name=" + channel_name
				+ ", view_cnt=" + view_cnt + ", part=" + part + "]";
	}
}
