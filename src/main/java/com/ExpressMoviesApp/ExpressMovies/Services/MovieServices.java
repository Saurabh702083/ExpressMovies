package com.ExpressMoviesApp.ExpressMovies.Services;

import com.ExpressMoviesApp.ExpressMovies.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServices {
    @Autowired
    private MovieRepository movieRepository;

}
