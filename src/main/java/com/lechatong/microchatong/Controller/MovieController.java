/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lechatong.microchatong.Controller;

import com.lechatong.microchatong.Service.MovieService;
import com.lechatong.microchatong.utils.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LeChatong
 */
@RestController
@RequestMapping("microchatong/movie")
public class MovieController {
    
    @Autowired
    private MovieService mService;
    
    @GetMapping("/list")
    public APIResponse findAllMovies(){
        return mService.getAllMovies();
    }
    
    @GetMapping("/{id}")
    public APIResponse findMovieById(@PathVariable int id){
        return mService.getMovieById(id);
    }
    
    @PostMapping("/search")
    public APIResponse findMovieByTitle(String title){
        return mService.findMovieByTitle(title);
    }
}
