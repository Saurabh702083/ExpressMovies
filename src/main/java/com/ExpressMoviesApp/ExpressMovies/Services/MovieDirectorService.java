package com.ExpressMoviesApp.ExpressMovies.Services;

import ch.qos.logback.core.testUtil.MockInitialContext;
import com.ExpressMoviesApp.ExpressMovies.Entity.Director;
import com.ExpressMoviesApp.ExpressMovies.Entity.Movie;
import com.ExpressMoviesApp.ExpressMovies.Repository.DirectorRepository;
import com.ExpressMoviesApp.ExpressMovies.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MovieDirectorService {
    @Autowired
    private DirectorRepository directorRepository;
    @Autowired
    private MovieRepository movieRepository;

    public Movie addMovie(Movie movie) {

        return movieRepository.save(movie);
    }

    public Director addDirector(Director director) {

        return directorRepository.save(director);
    }


    public Movie getMovieByMovieTitle(String movieTitle) {
        List<Movie> byMovieTitle = movieRepository.findByMovieTitle(movieTitle);
        if (byMovieTitle.isEmpty()) {
            throw new RuntimeException("Not present");

        }

        Movie movie_found = byMovieTitle.get(0);
        return movie_found;
    }

    public List<Movie>getAllMovies(){

        return movieRepository.findAll();
    }
    public void deleteMovie(Long movieId){
        Optional<Movie> movie = movieRepository.findById(movieId);
        if(movie.isEmpty()){
            throw new RuntimeException("Movie not found");

        }
        movieRepository.deleteById(movieId);
    }



}










