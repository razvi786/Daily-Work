package com.cts.activity.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="developer")
public class Developer {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Technology> technology;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Technology> getTechnology() {
		return technology;
	}
	public void setTechnology(Set<Technology> technology) {
		this.technology = technology;
	}
	
	

}
