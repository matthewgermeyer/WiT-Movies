package com.example.spring.repositories;

import com.example.spring.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by MattyG on 1/23/18.
 */
public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
