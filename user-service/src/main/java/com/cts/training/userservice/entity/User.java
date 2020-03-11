package com.cts.training.userservice.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class User implements Serializable{

	private static final long serialVersionUID = 3408677273608298734L;
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String password;
	private String email;
	private long phone;
	private boolean confirmed=false;
	private long code=(long) Math.ceil(Math.random()*100000000);
	private String dp="./assets/images/default.png";
	private String user_type="ROLE_USER";
	
	public User() {
		
	}

	public User(int id, String username, String password, String email, long phone, boolean confirmed, long code,
			String dp, String user_type) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.confirmed = confirmed;
		this.code = code;
		this.dp = dp;
		this.user_type = user_type;
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

	public String getDp() {
		return dp;
	}

	public void setDp(String dp) {
		this.dp = dp;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", phone="
				+ phone + ", confirmed=" + confirmed + ", code=" + code + ", dp=" + dp + ", user_type=" + user_type
				+ "]";
	}
	
}
