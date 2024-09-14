package com.ExpressMoviesApp.ExpressMovies.Repository;

import com.ExpressMoviesApp.ExpressMovies.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface MovieRepository extends JpaRepository<Movie,Long> {
    List<Movie> findByMovieTitle(String movieTitle);
}
