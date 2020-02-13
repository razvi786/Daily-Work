package com.cts.training.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.bean.Movie;
import com.cts.training.dao.MovieDAO;
import com.cts.training.daoimpl.MovieDAOImpl;

public class MovieController {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("./applicationContext.xml");

		MovieDAO movieDAO=(MovieDAO)context.getBean("movieDAOImpl");
		
		
		Movie movie1=new Movie(105,"Fast and Furious",10);
		
//		Movie mov=movieDAO.getMovieById(102);
//		mov.setRating(10);
		
		
		if(movieDAO.saveMovie(movie1)) {
			System.out.println("Success");
		}else {
			System.out.println("Failure");
		}
		
//		Movie movie2=movieDAO.getMovieById(102);
//		
//		System.out.println(movie2);
		
//		List<Movie> movies=movieDAO.getAllMovies();
//		
//		System.out.println(movies);

	}

}
