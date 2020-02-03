package com.cts.activity.bean;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="technology")
public class Technology {

	@Id
	@GeneratedValue
	private long id;
	private String language;
	@ManyToMany(mappedBy = "technology")
	private Set<Developer> developer;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Set<Developer> getDeveloper() {
		return developer;
	}
	public void setDeveloper(Set<Developer> developer) {
		this.developer = developer;
	}
	
	
	
}
