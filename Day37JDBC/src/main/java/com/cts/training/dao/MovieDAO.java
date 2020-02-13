package com.cts.training.dao;

import java.util.List;

import com.cts.training.bean.Movie;

public interface MovieDAO {
	
	public boolean saveMovie(Movie movie);
	
	public boolean removeMovie(Movie movie);
	
	public boolean updateMovie(Movie movie);
	
	public Movie getMovieById(int id);
	
	public List<Movie> getAllMovies();

}
