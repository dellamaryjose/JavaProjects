package com.movieratingservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieratingservice.models.Rating;

@RestController
@RequestMapping("/api/v1/rating")
public class MovieRatingController {
	
	@GetMapping("/{userId}")
	public Rating getRating(@PathVariable("userId") String userId) {
		
		Rating rating = new Rating(1, "1");
		return rating;
	}

}
