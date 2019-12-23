package com.lechatong.microchatong.Controller;

import com.lechatong.microchatong.Dao.userDAO;
import com.lechatong.microchatong.Model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private userDAO userDao;

    @GetMapping(value = "/user/list")
    public List<user> usersList(){
        return userDao.findAll();
    }

    @GetMapping(value = "/user/{id}")
    public user getUser(@PathVariable int id){
        return userDao.findById(id);
    }

    @GetMapping(value = "/user/searchUsername/{search}")
    public List<user> searchUsername(@PathVariable String search){
        return  userDao.findAllByUsernameLike("%"+search+"%");
    }

    @GetMapping(value = "/user/find/{username}/{email}")
    public user getUserByUsernameAndEmail(@PathVariable String username, @PathVariable String email){
        return userDao.searchUser(username, email);
    }
}

