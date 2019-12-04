package com.lechatong.microchatong.Controller;

import com.lechatong.microchatong.Dao.AdministratorDao;
import com.lechatong.microchatong.Model.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class AdministratorController {

    @Autowired
    private AdministratorDao administratorDao;

    @GetMapping(value = "/admin/list")
    public List<Administrator> administratorList(){
        return administratorDao.findAll();
    }

    @GetMapping(value = "/admin/{id}")
    public Administrator getAdmin(@PathVariable int id){
        return administratorDao.findById(id);
    }

    @PostMapping(value = "/adim/add")
    public ResponseEntity<Void> addAdmin(@RequestBody Administrator administrator){
        Administrator administrator1 = administratorDao.save(administrator);
        if (administrator == null){
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder.fromPath("/admin/{id}")
                .buildAndExpand(administrator1.getId_admin()).toUri();
        return ResponseEntity.created(location).build();
    }
}
