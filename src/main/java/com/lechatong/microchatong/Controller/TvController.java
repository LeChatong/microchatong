/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lechatong.microchatong.Controller;

import com.lechatong.microchatong.Service.TvService;
import com.lechatong.microchatong.utils.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("microchatong/tv")
public class TvController {
    
    @Autowired
    private TvService tvService;
    
    @GetMapping("/list")
    public APIResponse findAllTvs(){
        return tvService.getAllTv();
    }
    
    @GetMapping("/avaible")
    public APIResponse findAllTvsAvaible(){
        return tvService.getAllTvAvaible();
    }
    
    @GetMapping("/{id}")
    public APIResponse findTvById(@PathVariable int id){
        return tvService.getTvById(id);
    }
    
    @PostMapping("/search")
    public APIResponse findTvByTitle(String title){
        return tvService.findTvByTitle(title);
    }
}
