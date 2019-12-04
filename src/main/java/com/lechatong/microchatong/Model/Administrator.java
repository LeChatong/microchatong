package com.lechatong.microchatong.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "administrator")
public class Administrator {

    @Id
    @Column(name = "id_admin")
    private int id_admin;

    @Column(name = "account")
    private String account;

    @Column(name = "password")
    private String password;

    @Column(name = "is_super")
    private String is_super;

    @Column(name = "last_connection")
    private Date last_connection;

    public Administrator() {
    }

    public Administrator(int id_admin, String account, String password, String is_super, Date last_connection) {
        this.id_admin = id_admin;
        this.account = account;
        this.password = password;
        this.is_super = is_super;
        this.last_connection = last_connection;
    }

    public int getId_admin() {
        return id_admin;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getIs_super() {
        return is_super;
    }

    public Date getLast_connection() {
        return last_connection;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIs_super(String is_super) {
        this.is_super = is_super;
    }

    public void setLast_connection(Date last_connection) {
        this.last_connection = last_connection;
    }
}
