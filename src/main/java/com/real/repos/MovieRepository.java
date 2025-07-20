package com.real.repos;


import com.real.dto.MovieDTO;
import com.real.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long>{

    @Query("Select m.id, m.title, m.year from Movie m")
     List<MovieDTO> findAllMovies();

    @Query("Select m.id, m.title, m.year from Movie m where m.id :=id")
    Optional<MovieDTO> findAMovieById(long id);

    @Query("Select m.id, m.title, m.year from Movie m where m.title :=title")
    Optional<MovieDTO> findAMovieByTitle(String title);

    @Query("Select m.id, m.title, m.year from Movie m where m.year :=year")
    List<MovieDTO> findAMovie(long year);

}
