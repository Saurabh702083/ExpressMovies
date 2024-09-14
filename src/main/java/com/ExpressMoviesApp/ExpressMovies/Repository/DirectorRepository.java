package com.ExpressMoviesApp.ExpressMovies.Repository;

import com.ExpressMoviesApp.ExpressMovies.Entity.Director;
import com.ExpressMoviesApp.ExpressMovies.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DirectorRepository extends JpaRepository<Director,Long> {

    public List<Movie> findByFirstNameAndLastName(String firstName, String lastName);
}
