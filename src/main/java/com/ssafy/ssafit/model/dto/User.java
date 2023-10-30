package com.ssafy.ssafit.model.dto;

public class User {
	private int user_seq;
	private String id;
	private String password;
	private String name;
	private String email;
	private String created_at;
	private String phone_num;
	private int age;
	private String nickname;
	private int gender; //0: 남자, 1: 여자
	private String fav_sport;
	private String sido_add;
	private String goo_add;
	private String dong_myun_add;
	
	public User() {	}

	public User(int user_seq, String id, String password, String name, String email, String created_at,
			String phone_num, int age, String nickname, int gender, String fav_sport, String sido_add, String goo_add,
			String dong_myun_add) {
		this.user_seq = user_seq;
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.created_at = created_at;
		this.phone_num = phone_num;
		this.age = age;
		this.nickname = nickname;
		this.gender = gender;
		this.fav_sport = fav_sport;
		this.sido_add = sido_add;
		this.goo_add = goo_add;
		this.dong_myun_add = dong_myun_add;
	}

	public int getUser_seq() {
		return user_seq;
	}

	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
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

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getFav_sport() {
		return fav_sport;
	}

	public void setFav_sport(String fav_sport) {
		this.fav_sport = fav_sport;
	}

	public String getSido_add() {
		return sido_add;
	}

	public void setSido_add(String sido_add) {
		this.sido_add = sido_add;
	}

	public String getGoo_add() {
		return goo_add;
	}

	public void setGoo_add(String goo_add) {
		this.goo_add = goo_add;
	}

	public String getDong_myun_add() {
		return dong_myun_add;
	}

	public void setDong_myun_add(String dong_myun_add) {
		this.dong_myun_add = dong_myun_add;
	}

	@Override
	public String toString() {
		return "User [user_seq=" + user_seq + ", id=" + id + ", password=" + password + ", name=" + name + ", email="
				+ email + ", created_at=" + created_at + ", phone_num=" + phone_num + ", age=" + age + ", nickname="
				+ nickname + ", gender=" + gender + ", fav_sport=" + fav_sport + ", sido_add=" + sido_add + ", goo_add="
				+ goo_add + ", dong_myun_add=" + dong_myun_add + "]";
	}

	
}