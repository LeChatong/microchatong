package com.lechatong.microchatong.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.Temporal;

@Entity(name = "auth_user")
public class UserModel implements Serializable {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "password")
    private String password;

    @Column(name = "last_login")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date last_login;

    @Column(name = "is_superuser")
    private String is_superuser;

    @Column(name = "username")
    private String username;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "email")
    private String email;

    @Column(name = "is_staff")
    private Boolean is_staff;

    @Column(name = "is_active")
    private Boolean is_active;

    @Column(name = "date_joined")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date_joined;

    public UserModel() {
    }

    public UserModel(int id, String password, Date last_login, String is_superuser, String username, String first_name, String last_name, String email, Boolean is_staff, Boolean is_active, Date date_joined) {
        this.id = id;
        this.password = password;
        this.last_login = last_login;
        this.is_superuser = is_superuser;
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.is_staff = is_staff;
        this.is_active = is_active;
        this.date_joined = date_joined;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLast_login() {
        return last_login;
    }

    public void setLast_login(Date last_login) {
        this.last_login = last_login;
    }

    public String getIs_superuser() {
        return is_superuser;
    }

    public void setIs_superuser(String is_superuser) {
        this.is_superuser = is_superuser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIs_staff() {
        return is_staff;
    }

    public void setIs_staff(Boolean is_staff) {
        this.is_staff = is_staff;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    public Date getDate_joined() {
        return date_joined;
    }

    public void setDate_joined(Date date_joined) {
        this.date_joined = date_joined;
    }
}
