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
    
    @Query("SELECT u FROM auth_user u WHERE LOWER(u.username) LIKE lower(:search)\n" +
            "  OR LOWER(u.first_name)LIKE lower(:search) OR LOWER(u.last_name)LIKE lower(:search)\n" +
            "  ORDER BY u.first_name, u.last_name, u.username")
    public List<UserModel> findAllBySearch(@Param("search") String search);

    @Query("SELECT u " +
            "FROM auth_user u where u.username = :username AND u.email = :email")
    public UserModel searchUserByUsernameAndEmail(@Param("username") String username, @Param("email") String email);
}
