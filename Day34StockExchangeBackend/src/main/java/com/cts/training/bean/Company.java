package com.cts.training.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Company implements Serializable{

	private static final long serialVersionUID = -3774796956003475482L;
	@Id
	private int id;
	private String name;
	private double turnover;
	private String ceo;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@CollectionTable(name = "board_of_director")
	private List<String> board_of_directors;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@CollectionTable(name = "listed_in_stock_exchange")
	private List<String> listed_in_stock_exchanges;
	
	private String sector;
	private String brief;
	private String stock_code;
	private boolean activated;
	
	public Company() {
		
	}

	public Company(int id, String name, double turnover, String ceo, List<String> board_of_directors,
			List<String> listed_in_stock_exchanges, String sector, String brief, String stock_code, boolean activated) {
		super();
		this.id = id;
		this.name = name;
		this.turnover = turnover;
		this.ceo = ceo;
		this.board_of_directors = board_of_directors;
		this.listed_in_stock_exchanges = listed_in_stock_exchanges;
		this.sector = sector;
		this.brief = brief;
		this.stock_code = stock_code;
		this.activated = activated;
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

	public List<String> getBoard_of_directors() {
		return board_of_directors;
	}

	public void setBoard_of_directors(List<String> board_of_directors) {
		this.board_of_directors = board_of_directors;
	}

	public List<String> getListed_in_stock_exchanges() {
		return listed_in_stock_exchanges;
	}

	public void setListed_in_stock_exchanges(List<String> listed_in_stock_exchanges) {
		this.listed_in_stock_exchanges = listed_in_stock_exchanges;
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

	public String getStock_code() {
		return stock_code;
	}

	public void setStock_code(String stock_code) {
		this.stock_code = stock_code;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", turnover=" + turnover + ", ceo=" + ceo
				+ ", board_of_directors=" + board_of_directors + ", listed_in_stock_exchanges="
				+ listed_in_stock_exchanges + ", sector=" + sector + ", brief=" + brief + ", stock_code=" + stock_code
				+ ", activated=" + activated + "]";
	}

	
	
	

}
