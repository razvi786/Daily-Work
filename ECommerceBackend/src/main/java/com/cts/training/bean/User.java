package com.cts.training.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table
public class User implements Serializable {

	private static final long serialVersionUID = -5376520827710642568L;
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String password;
	private boolean admin=false;
	private boolean confirmed=false;
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
	public boolean isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
	public User() {
		
	}
	public User(int id, String username, String password, boolean admin, boolean confirmed) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.admin = admin;
		this.confirmed = confirmed;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", admin=" + admin
				+ ", confirmed=" + confirmed + "]";
	}
	
	
	
}