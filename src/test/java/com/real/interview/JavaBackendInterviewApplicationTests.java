package com.real.interview;

import com.real.dto.MovieDTO;
import com.real.entity.Movie;
import com.real.repos.MovieRepository;
import com.real.service.MovieService;
import com.real.service.MovieServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class JavaBackendInterviewApplicationTests {

	@Test
	void contextLoads() {
	}
	@InjectMocks
	private MovieServiceImpl movieService;

	@Mock
	private MovieRepository movieRepository;

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testFindEmployeeById() {
		Movie movie = new Movie(12, "GOAT", 2020);
		movieRepository.save(movie);
		MovieDTO movieDTO = null;
		when(movieRepository.findAMovieById(1L)).thenReturn(Optional.of(movieDTO));
		MovieDTO found = movieService.findById(1L).orElse(null);
		assertEquals("GOAT", found.getTitle());
	}



}
