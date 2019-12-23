package com.lechatong.microchatong.Dao;

import com.lechatong.microchatong.Model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface userDAO extends JpaRepository<user, Integer> {
    public user findById(int id);
    public List<user> findAll();
    public user save(user User);
    public List<user> findAllByUsernameLike(String usernameSearch);

    @Query("SELECT u " +
            "FROM auth_user u where u.username = :username AND u.email = :email")
    public user searchUser(@Param("username") String username, @Param("email") String email);
}
