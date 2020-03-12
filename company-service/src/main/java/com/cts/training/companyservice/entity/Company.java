package com.cts.training.companyservice.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Company implements Serializable{

	private static final long serialVersionUID = -3774796956003475482L;
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double turnover;
	private String ceo;
	private String sector;
	private String brief;
	private boolean activated=true;
	@ElementCollection(fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	@CollectionTable(name = "directors")
	private List<String> directors;
	@OneToMany(cascade = CascadeType.ALL)
	private List<ListedIn> listedIn;

	public Company() {
		
	}

	public Company(int id, String name, double turnover, String ceo, String sector, String brief, boolean activated,
			List<String> directors, List<ListedIn> listedIn) {
		super();
		this.id = id;
		this.name = name;
		this.turnover = turnover;
		this.ceo = ceo;
		this.sector = sector;
		this.brief = brief;
		this.activated = activated;
		this.directors = directors;
		this.listedIn = listedIn;
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

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public List<String> getDirectors() {
		return directors;
	}

	public void setDirectors(List<String> directors) {
		this.directors = directors;
	}

	public List<ListedIn> getListedIn() {
		return listedIn;
	}

	public void setListedIn(List<ListedIn> listedIn) {
		this.listedIn = listedIn;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", turnover=" + turnover + ", ceo=" + ceo + ", sector=" + sector
				+ ", brief=" + brief + ", activated=" + activated + ", directors=" + directors + ", listedIn="
				+ listedIn + "]";
	}	

}
