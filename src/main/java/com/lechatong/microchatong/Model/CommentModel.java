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
@Entity(name = "lcu_comment")
public class CommentModel implements Serializable{
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "name_sender")
    private String name_sender;
    
    @Column(name = "message")
    private String message;
    
    @Column(name = "email_sender")
    private String email_sender;
    
    @Column(name = "id_movie")
    private Long id_movie;
    
    @Column(name = "id_tv")
    private Long id_tv;
    
    @Column(name = "is_reply")
    private boolean is_reply;
    
    @Column(name = "is_delete")
    private boolean is_delete;
    
    @Column(name = "is_locked")
    private boolean is_locked;
    
    @Column(name = "comment_parent_id", nullable = true)
    private Long comment_parent_id;
    
    @Column(name = "member_id")
    private Long member_id;
    
    @Column(name = "created_at")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created_at;
    
    @Column(name = "updated_at")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date updated_at;

    public CommentModel() {
    }

    public CommentModel(Long id, String name_sender, String message, String email_sender, Long id_movie, Long id_tv, boolean is_reply, boolean is_delete, boolean is_locked, Long comment_parent_id, Long member_id, Date created_at, Date updated_at) {
        this.id = id;
        this.name_sender = name_sender;
        this.message = message;
        this.email_sender = email_sender;
        this.id_movie = id_movie;
        this.id_tv = id_tv;
        this.is_reply = is_reply;
        this.is_delete = is_delete;
        this.is_locked = is_locked;
        this.comment_parent_id = comment_parent_id;
        this.member_id = member_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_sender() {
        return name_sender;
    }

    public void setName_sender(String name_sender) {
        this.name_sender = name_sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEmail_sender() {
        return email_sender;
    }

    public void setEmail_sender(String email_sender) {
        this.email_sender = email_sender;
    }

    public Long getId_movie() {
        return id_movie;
    }

    public void setId_movie(Long id_movie) {
        this.id_movie = id_movie;
    }

    public Long getId_tv() {
        return id_tv;
    }

    public void setId_tv(Long id_tv) {
        this.id_tv = id_tv;
    }

    public boolean isIs_reply() {
        return is_reply;
    }

    public void setIs_reply(boolean is_reply) {
        this.is_reply = is_reply;
    }

    public boolean isIs_delete() {
        return is_delete;
    }

    public void setIs_delete(boolean is_delete) {
        this.is_delete = is_delete;
    }

    public boolean isIs_locked() {
        return is_locked;
    }

    public void setIs_locked(boolean is_locked) {
        this.is_locked = is_locked;
    }

    public Long getComment_parent_id() {
        return comment_parent_id;
    }

    public void setComment_parent_id(Long comment_parent_id) {
        this.comment_parent_id = comment_parent_id;
    }

    public Long getMember_id() {
        return member_id;
    }

    public void setMember_id(Long member_id) {
        this.member_id = member_id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
    
    
}
