package com.real.service;

import com.real.dto.MovieDTO;
import com.real.entity.Movie;
import com.real.repos.MovieRepository;
import com.real.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    MovieRepository movieRepository;

    @Override
    public List<MovieDTO> getMovies() {
        return movieRepository.findAllMovies();
    }

    @Override
    public Movie addMovie(Movie movie) {
       //TODO validation
        // if(Objects.nonNull(movie))
            return movieRepository.save(movie);
    }

    @Override
    public Movie updateMovie(Movie movie) {
        if(movieRepository.existsById(movie.getId())){
            Movie updatedMovie = movieRepository.save(movie);
            return updatedMovie;
        }
        else{
            throw new RuntimeException(Constants.MOVIE_NOT_FOUND);
        }
    }

    @Override
    public boolean deleteMovieById(long id) {
        if(movieRepository.existsById(id)){
            movieRepository.deleteById(id);
            return true;
        }
        else{
            throw new RuntimeException(Constants.MOVIE_NOT_FOUND);
        }
    }

    @Override
    public Optional<MovieDTO> findById(long id) {
        return movieRepository.findAMovieById(id);
    }

    @Override
    public Optional<MovieDTO> findByTitle(String title) {
        return movieRepository.findAMovieByTitle(title);
    }

    @Override
    public List<MovieDTO> findByReleaseYear(long releaseYear) {
        return movieRepository.findAMovie(releaseYear);
    }

}
