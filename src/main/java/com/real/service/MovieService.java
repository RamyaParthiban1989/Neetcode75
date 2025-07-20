package com.real.service;

import com.real.dto.MovieDTO;
import com.real.entity.Movie;
import com.real.repos.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface MovieService {

    List<MovieDTO> getMovies();

    Movie addMovie(Movie movie);

    Movie updateMovie(Movie movie);

    boolean deleteMovieById(long id);

    Optional<MovieDTO> findById(long id);

    Optional<MovieDTO> findByTitle(String title);

    List<MovieDTO> findByReleaseYear(long releaseYear);

}
