package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="prod")
@XmlRootElement(name="item")
public class Product {
	
		@Id
		@GeneratedValue
		private Integer id;
		private String description;
		private int price;
		
		public Product() {
			
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getdescription() {
			return description;
		}

		public void setdescription(String description) {
			this.description = description;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public Product(Integer id, String description, int price) {
			super();
			this.id = id;
			this.description = description;
			this.price = price;
		}

		@Override
		public String toString() {
			return "Product [id=" + id + ", description=" + description + ", price=" + price + "]";
		}
		
}
