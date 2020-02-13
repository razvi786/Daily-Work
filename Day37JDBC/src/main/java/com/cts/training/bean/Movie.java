package com.cts.training.bean;

import java.io.Serializable;

public class Movie implements Serializable{

	private static final long serialVersionUID = 397679451124134271L;
	
		private int id;
		private String name;
		private int rating;
		
		public Movie() {
			
		}

		public Movie(int id, String name, int rating) {
			super();
			this.id = id;
			this.name = name;
			this.rating = rating;
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

		public int getRating() {
			return rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}

		@Override
		public String toString() {
			return "Id=" + id + "\nName=" + name + "\nRating=" + rating + "\n";
		}
		
		
}
