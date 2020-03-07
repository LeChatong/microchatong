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
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping(value = "/list")
    public ResponseEntity usersList(){
        return ResponseEntity.ok(service.getAllUsers()) ;
    }

    @GetMapping(value = "/{id}")
    public APIResponse getUser(@PathVariable int id){
        return service.getOneUser(id);
    }

    @GetMapping(value = "/searchUsername/{search}")
    public APIResponse searchUsername(@PathVariable String search){
        return  service.searchUserByUsername(search);
    }

    @GetMapping(value = "/find/{username}/{email}")
    public UserModel getUserByUsernameAndEmail(@PathVariable String username, @PathVariable String email){
        return service.searchUser(username, email);
    }
}

