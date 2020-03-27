package com.lechatong.microchatong.Controller;

import com.lechatong.microchatong.Repository.UserRepository;
import com.lechatong.microchatong.Model.UserModel;
import com.lechatong.microchatong.Service.UserService;
import com.lechatong.microchatong.utils.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("microchatong/user")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping(value = "/list")
    public APIResponse usersList(){
        return service.getAllUsers() ;
    }

    @GetMapping(value = "/{id}")
    public APIResponse getUser(@PathVariable int id){
        return service.getOneUser(id);
    }

    @PostMapping(value = "/search")
    public APIResponse search(String search){
        return  service.searchUser(search);
    }

    @PostMapping(value = "/login")
    public APIResponse getUserByUsernameAndEmail(String username, String email){
        return service.login(username, email);
    }
}

