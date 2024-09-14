package com.ExpressMoviesApp.ExpressMovies.Entity;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Movie")
public class Movie {
    @Id

    private Long movieId;
    private String movieTitle;
//    private Date dateReleased;
//    private Date movieRunningTime;



    @ManyToMany(mappedBy = "movies")
    private List<Director>directors;

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

//    public Date getDateReleased() {
//        return dateReleased;
//    }

//    public void setDateReleased(Date dateReleased) {
//        this.dateReleased = dateReleased;
//    }


//    public Date getMovieRunningTime() {
//        return movieRunningTime;
//    }

//    public void setMovieRunningTime(Date movieRunningTime) {
//        this.movieRunningTime = movieRunningTime;
//    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }

    public Movie() {
    }

    public Movie(long movieId, String movieTitle, Date dateReleased, Date movieRunningTime) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
//        this.dateReleased = dateReleased;
//        this.movieRunningTime = movieRunningTime;




    }
}
