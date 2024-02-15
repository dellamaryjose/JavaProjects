package com.movieinfoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/api/v1/info")
public class MovieInfoController {

	
	@GetMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId") String movieId) {
	Movie movie = new Movie("1", "Transformers");
	return movie;
		
	}
}
