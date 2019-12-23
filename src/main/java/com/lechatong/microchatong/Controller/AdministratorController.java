package com.lechatong.microchatong.Controller;

import com.lechatong.microchatong.Dao.AdministratorDao;
import com.lechatong.microchatong.Model.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
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

    @RequestMapping(value = "addadmin", method = RequestMethod.POST)
    public ResponseEntity<Void> addAdmin(@RequestBody Administrator administrator){
        Administrator administrator1 = administratorDao.save(administrator);
        if (administrator1 == null){
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/admin/{id}")
                .buildAndExpand(administrator1.getId_admin()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping(value = "/admin/searchAccount/{search}")
    public List<Administrator> searchAccount(@PathVariable String search){
        return  administratorDao.findAllByAccountLike("%"+search+"%");
    }

    @DeleteMapping(value = "/admin/delete/{id}")
    public void deleteAdmin(@PathVariable int id){
        administratorDao.deleteById(id);
    }

    @RequestMapping(value = "editadmin", method = RequestMethod.PUT)
    public String updateAdmin(@RequestBody Administrator administrator){
        administratorDao.save(administrator);
        return "Mise à jour du Compte effectué avec succès";
    }

    @GetMapping(value = "/admin/orderlist")
    public MappingJacksonValue adminListOrder(){
        List<Administrator> administrators = administratorDao.listAdminInOrder();
        MappingJacksonValue adminFilter = new MappingJacksonValue(administrators);
        return adminFilter;
    }

}
