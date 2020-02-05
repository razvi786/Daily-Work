package com.cts.activity.bean;

import java.io.Serializable;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table
public class User implements Serializable{

	private static final long serialVersionUID = 3408677273608298734L;
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String password;
	private boolean admin;
	private String email;
	private long phone;
	private boolean confirmed;
	private long code;
	@ElementCollection
	@CollectionTable(name="languages")
	@OrderColumn(name="language_id")
	private String[] languages;
	
	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	public User() {
		
	}

	public User(int id, String username, String password, boolean admin, String email, long phone, boolean confirmed,
			long code) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.admin = admin;
		this.email = email;
		this.phone = phone;
		this.confirmed = confirmed;
		this.code = code;
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
