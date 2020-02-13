package com.cts.training.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.cts.training.bean.Movie;
import com.cts.training.dao.MovieDAO;

public class MovieDAOImpl implements MovieDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}

	public boolean saveMovie(Movie movie) {
		try {
			String query="INSERT INTO movie VALUES (?,?,?)";
			jdbcTemplate.update(query,movie.getId(),movie.getName(),movie.getRating());
			return true;
		} catch (Exception e) {
			System.out.println("Exception in Saving Movie: " + e.getMessage());
			return false;
		}
	}

	public boolean removeMovie(Movie movie) {
		try {
			String query="DELETE FROM movie WHERE id=?";
			jdbcTemplate.update(query,movie.getId());
			return true;
		} catch (Exception e) {
			System.out.println("Exception in Removing Movie: " + e.getMessage());
			return false;
		}
	}

	public boolean updateMovie(Movie movie) {
		try {
			String query="UPDATE movie SET id=?,name=?,rating=? WHERE id="+movie.getId();
			jdbcTemplate.update(query,movie.getId(),movie.getName(),movie.getRating());
			return true;
		} catch (Exception e) {
			System.out.println("Exception in Updating Movie: " + e.getMessage());
			return false;
		}
	}

	public Movie getMovieById(int id) {
		try {
			String query="SELECT * FROM movie WHERE id="+id;
			RowMapper<Movie> rowMapper=new BeanPropertyRowMapper<Movie>(Movie.class);
			return jdbcTemplate.queryForObject(query, rowMapper);
		} catch (Exception e) {
			System.out.println("Exception in Get Movie By Id: " + e.getMessage());
			return null;
		}
	}

	public List<Movie> getAllMovies() {
		try {
			return jdbcTemplate.query("SELECT * FROM movie",new ResultSetExtractor<List<Movie>>() {

				public List<Movie> extractData(ResultSet rs) throws SQLException, DataAccessException {

					List<Movie> movies=new ArrayList<Movie>();
					while(rs.next()) {
						Movie movie=new Movie();
						movie.setId(rs.getInt("id"));
						movie.setName(rs.getString("name"));
						movie.setRating(rs.getInt("rating"));
						movies.add(movie);
					}
					return movies;
					
				}
			});
		} catch (Exception e) {
			System.out.println("Exception in Getting All Movies: " + e.getMessage());
			return null;
		}
	}

}
