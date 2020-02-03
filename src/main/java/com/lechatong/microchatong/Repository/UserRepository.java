package com.lechatong.microchatong.Repository;

import com.lechatong.microchatong.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {
    public UserModel findById(int id);
    @Override
    public List<UserModel> findAll();
    @Override
    public UserModel save(UserModel User);
    public List<UserModel> findAllByUsernameLike(String usernameSearch);

    @Query("SELECT u " +
            "FROM auth_user u where u.username = :username AND u.email = :email")
    public UserModel searchUser(@Param("username") String username, @Param("email") String email);
}
