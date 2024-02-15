package com.moviecatalogservice.controller;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.moviecatalogservice.models.CatalogItem;
import com.moviecatalogservice.models.Movie;
import com.moviecatalogservice.models.Rating;

@RestController
@RequestMapping("api/v1/catalog")
public class MovieCatalogController {

	@Autowired
	RestTemplate restTemplate;	
	
	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalogList(@PathVariable("userId") String userId){
		
		/*
		 * CatalogItem movie1 = new CatalogItem("Movie1", "Movie-1 Details", 4);
		 * CatalogItem movie2 = new CatalogItem("Movie2", "Movie-2 Details", 2);
		 * CatalogItem movie3 = new CatalogItem("Movie3", "Movie-3 Details", 3);
		 * 
		 * List<CatalogItem> catList = Arrays.asList(movie1,movie2,movie3); return
		 * catList;
		 */
	List<Rating> ratingList = Arrays.asList(new Rating(4,"1"),new Rating(3,"2"));
	List<CatalogItem> catalogList = ratingList.stream().map
			(rating->
			{		System.out.println("Calling Micro...");
				Movie movie = restTemplate
						.getForObject("http://localhost:8082/api/v1/info/"+rating.getMovieId(), Movie.class);
				
				return new CatalogItem(movie.getMovieName(),"Test",rating.getRating());
			}
			
					).collect(Collectors.toList());
			
return catalogList;
}
}
