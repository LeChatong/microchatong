package com.lechatong.microchatong.Dao;

import com.lechatong.microchatong.Model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdministratorDao extends JpaRepository<Administrator, Integer> {
    public Administrator findById(int id);
    public List<Administrator> findAll();
    public Administrator save(Administrator administrator);
}
