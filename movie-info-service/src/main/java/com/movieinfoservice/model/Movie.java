package com.movieinfoservice.model;

public class Movie {
 String movieId;
 String movieName;
public Movie(String movieId, String movieName) {
	super();
	this.movieId = movieId;
	this.movieName = movieName;
}
public String getMovieId() {
	return movieId;
}
public void setMovieId(String movieId) {
	this.movieId = movieId;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
 
 
 
}
