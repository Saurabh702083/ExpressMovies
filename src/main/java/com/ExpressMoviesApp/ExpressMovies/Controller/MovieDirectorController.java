package com.ExpressMoviesApp.ExpressMovies.Controller;

import com.ExpressMoviesApp.ExpressMovies.Entity.Director;
import com.ExpressMoviesApp.ExpressMovies.Entity.Movie;
import com.ExpressMoviesApp.ExpressMovies.Repository.DirectorRepository;
import com.ExpressMoviesApp.ExpressMovies.Services.MovieDirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class MovieDirectorController {
    @Autowired
    private MovieDirectorService movieDirectorService;

    @Autowired
    private DirectorRepository directorRepository;



    @PostMapping("/addMovie")
    public ResponseEntity<?> addMovie(@RequestBody Movie movie) {
        try {
            Movie savedMovie = movieDirectorService.addMovie(movie);
            return ResponseEntity.ok(savedMovie);
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception details
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
        }
    }
//    @PostMapping("/addMovie")
//    public Movie addMovie(@RequestBody Movie movie) {
//
//        return movieDirectorService.addMovie(movie);
//    }

    @PostMapping("/addDirector")
    public Director addDirector(@RequestBody Director director) {
        return movieDirectorService.addDirector(director);
    }


    @GetMapping("/{movieTitle}")
    public Movie getMovieByMovieTitle(@PathVariable String movieTitle) {
       return movieDirectorService.getMovieByMovieTitle(movieTitle);
    }

    @GetMapping("/allMovie")
    public List<Movie> getAllMovies(){
        return movieDirectorService.getAllMovies();
    }

    @DeleteMapping("/{movieID}")
    public ResponseEntity<String>removeMovie(@PathVariable Long movieId){
        movieDirectorService.deleteMovie(movieId);
        return ResponseEntity.ok("Movie deleted");


    }
    @GetMapping("/Director/{firstName}/{lastName}")
    public ResponseEntity<List<Movie>>getMovieByDirector(@PathVariable String firstName, @PathVariable String lastName){
        List<Movie> byFirstNameAndLastName = directorRepository.findByFirstNameAndLastName(firstName, lastName);
        return  ResponseEntity.ok(byFirstNameAndLastName);
    }

}








