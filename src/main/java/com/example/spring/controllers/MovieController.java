package com.example.spring.controllers;

import com.example.spring.entities.Movie;
import com.example.spring.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by MattyG on 1/23/18.
 */

@Controller
public class MovieController {
    @Autowired
    MovieRepository movieRepo;

    @GetMapping("/")
    public String getHome(Model model, @RequestParam(defaultValue = "0") int page){
        model.addAttribute("data",movieRepo.findAll(new PageRequest(page, 5)));
        model.addAttribute("currentPage", page);
        return "index";
    }

    @PostMapping("/save")
    public String save(Movie c) {
        movieRepo.save(c);

        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteMovie(Integer id){
        movieRepo.delete(id);

        return "redirect:/";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public Movie findOne(Integer id){
        return movieRepo.findOne(id);
    }

}
