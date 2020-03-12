package com.cts.training.sectorservice.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="sectors")
@Component
public class Sector implements Serializable{

	private static final long serialVersionUID = 6516600168260975731L;
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String brief;
	
	public Sector() {
		
	}
	
	public Sector(String name, String brief) {
		this.name = name;
		this.brief = brief;
	}

	public Sector(int id, String name, String brief) {
		super();
		this.id = id;
		this.name = name;
		this.brief = brief;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	@Override
	public String toString() {
		return "Sector [id=" + id + ", name=" + name + ", brief=" + brief + "]";
	}

}
