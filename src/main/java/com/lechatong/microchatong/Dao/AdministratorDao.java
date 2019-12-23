package com.lechatong.microchatong.Dao;

import com.lechatong.microchatong.Model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AdministratorDao extends JpaRepository<Administrator, Integer> {
    public Administrator findById(int id);
    public List<Administrator> findAll();
    public Administrator save(Administrator administrator);
    public List<Administrator> findAllByAccountLike(String accountSearch);

    @Query("SELECT a.id_admin, a.account,a.password, a.is_super, a.last_connection FROM administrator a ORDER BY a.account")
    public List<Administrator> listAdminInOrder();
}
