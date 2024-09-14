package com.ExpressMoviesApp.ExpressMovies.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Director")
public class Director {

    @Id

    private Long directorId;
    private String firstName;
    private String lastName;
    private String address;
    private int contactNumber;
    private String email;

    @ManyToMany

    @JoinTable(
            name = "movie_director",
            joinColumns = @JoinColumn(name = "director_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id")
    )
    private List<Movie>movies;


    public long getDirectorId() {
        return directorId;
    }

    public void setDirectorId(long directorId) {
        this.directorId = directorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public Director() {
    }

    public Director(long directorId, String firstName, String lastName, String address, int contactNumber, String email) {
        this.directorId = directorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.email = email;
    }
}
