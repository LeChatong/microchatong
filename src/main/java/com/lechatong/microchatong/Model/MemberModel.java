/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lechatong.microchatong.Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author LeChatong
 */

@Entity(name = "lcu_member")
public class MemberModel implements Serializable{
    @Id
    @Column(name = "id")
    private int id;
    
    @Column(name = "first_name")
    private String first_name;
    
    @Column(name = "username")
    private String username;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "created_at")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created_at;
    
    @Column(name = "last_connexion")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date last_connexion;
    
    @Column(name = "is_active")
    private Boolean is_active;
    
    @Column(name = "is_delete")
    private Boolean is_delete;
    
    @Column(name = "is_modarator")
    private Boolean is_modarator;
    
    @Column(name = "avatar")
    private String avatar;

    public MemberModel() {
    }

    public MemberModel(int id, String first_name, String username, String password, String email, Date created_at, Date last_connexion, Boolean is_active, Boolean is_delete, Boolean is_modarator, String avatar) {
        this.id = id;
        this.first_name = first_name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.created_at = created_at;
        this.last_connexion = last_connexion;
        this.is_active = is_active;
        this.is_delete = is_delete;
        this.is_modarator = is_modarator;
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getLast_connexion() {
        return last_connexion;
    }

    public void setLast_connexion(Date last_connexion) {
        this.last_connexion = last_connexion;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    public Boolean getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Boolean is_delete) {
        this.is_delete = is_delete;
    }

    public Boolean getIs_modarator() {
        return is_modarator;
    }

    public void setIs_modarator(Boolean is_modarator) {
        this.is_modarator = is_modarator;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    
}
