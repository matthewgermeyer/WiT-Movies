package com.example.spring;

import com.example.spring.entities.Movie;
import com.example.spring.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private MovieRepository movieRepo;

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        movieRepo.save(new Movie("Pulp Fiction", "Drama"));
        movieRepo.save(new Movie("Hot Fuzz", "Comedy"));
        movieRepo.save(new Movie("The Godfather", "Drama"));
        movieRepo.save(new Movie("The Terminator", "Action"));
        movieRepo.save(new Movie("50 First Dates", "RomCom"));
        movieRepo.save(new Movie("Toy Story", "Kids"));
        movieRepo.save(new Movie("The Prestige", "Drama"));
        movieRepo.save(new Movie("Transformers", "Action"));
        movieRepo.save(new Movie("Sleepless", "RomCom"));
        movieRepo.save(new Movie("The Incredibles", "Kids"));

        movieRepo.save(new Movie("The Terminator", "Action"));
        movieRepo.save(new Movie("50 First Dates", "RomCom"));
        movieRepo.save(new Movie("Toy Story", "Kids"));
        movieRepo.save(new Movie("The Prestige", "Drama"));
        movieRepo.save(new Movie("Transformers", "Action"));
        movieRepo.save(new Movie("Sleepless", "RomCom"));
        movieRepo.save(new Movie("The Incredibles", "Kids"));

    }
}
