package com.cts.training.sectorservice.model;

public class User{

	private int id;
	private String username;
	private String password;
	private boolean admin=false;
	private String email;
	private long phone;
	private boolean confirmed=false;
	private long code=(long) Math.ceil(Math.random()*100000000);
	private String dp="./assets/images/default.png";
	
	public User() {
		
	}

	public String getDp() {
		return dp;
	}

	public void setDp(String dp) {
		this.dp = dp;
	}

	public User(int id, String username, String password, boolean admin, String email, long phone, boolean confirmed,
			long code,String dp) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.admin = admin;
		this.email = email;
		this.phone = phone;
		this.confirmed = confirmed;
		this.code = code;
		this.dp=dp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", admin=" + admin + ", email="
				+ email + ", phone=" + phone + ", confirmed=" + confirmed + ", code=" + code + "]";
	}
	
}
