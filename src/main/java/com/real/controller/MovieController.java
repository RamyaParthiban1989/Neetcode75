package com.real.controller;

import com.real.dto.MovieDTO;
import com.real.entity.Movie;
import com.real.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


/*
Screening Interview
Welcome to the screening interview! For this exercise, we are going to implement a simple CRUD API using Spring Boot and JPA. Use H2 as in memory db if needed.

Build a microservice that will return metadata for movies that will power a website similar to IMDb.com.
Your API should be able to do the following:
Create, read, update, and delete an individual movie.
Search for movies by their title and release year.
A movie consists of the following data:
ID
Title
Release Year
Please implement all of the necessary classes and configuration in order to support the specified APIs above.
 */
@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    List<MovieDTO> getMovie() {

        return movieService.getMovies();
    }

    @GetMapping("/movies/{id}")
    Optional<MovieDTO> findAMovieById(long id){
        return movieService.findById(id);
    }

    @PostMapping("/movies")
    public Movie addAMovie(Movie movie){
        return movieService.addMovie(movie);
    }

    @PutMapping("/movies")
    public Movie updateMovie(Movie movie){
        return movieService.updateMovie(movie);
    }

    @GetMapping("/movies/{title}")
    Optional<MovieDTO> findAMovieByTitle(String title){
        return movieService.findByTitle(title);
    }

    @GetMapping("/movies/{year}")
    List<MovieDTO> listMoviesByReleaseYear(long year){
        return movieService.findByReleaseYear(year);
    }


}
