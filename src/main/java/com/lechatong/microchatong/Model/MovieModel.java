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

@Entity(name = "lcu_movie_detail")
public class MovieModel implements Serializable {
    @Id
    @Column(name = "id")
    private int id;
    
    @Column(name = "id_movie")
    private int id_movie;
    
    @Column(name = "title_movie")
    private String title_movie;
    
    @Column(name = "link_download")
    private String link_download;
    
    @Column(name = "voice_language")
    private String voice_language;
    
    @Column(name = "quality_video")
    private String quality_video;
    
    @Column(name = "quality_audio")
    private String quality_audio;
    
    @Column(name = "subtitle")
    private String subtitle;
    
    @Column(name = "subtitle_language")
    private String subtitle_language;
    
    @Column(name = "created_at")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created_at;
    
    @Column(name = "updated_at")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date updated_at;
    
    @Column(name = "member_id")
    private int member_id;

    public MovieModel() {
    }

    public MovieModel(int id, int id_movie, String title_movie, String link_download, String voice_language, 
            String quality_video, String quality_audio, String subtitle, String subtitle_language, 
            Date created_at, Date updated_at, int member_id) {
        this.id = id;
        this.id_movie = id_movie;
        this.title_movie = title_movie;
        this.link_download = link_download;
        this.voice_language = voice_language;
        this.quality_video = quality_video;
        this.quality_audio = quality_audio;
        this.subtitle = subtitle;
        this.subtitle_language = subtitle_language;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.member_id = member_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_movie() {
        return id_movie;
    }

    public void setId_movie(int id_movie) {
        this.id_movie = id_movie;
    }

    public String getTitle_movie() {
        return title_movie;
    }

    public void setTitle_movie(String title_movie) {
        this.title_movie = title_movie;
    }

    public String getVoice_language() {
        return voice_language;
    }

    public void setVoice_language(String voice_language) {
        this.voice_language = voice_language;
    }

    public String getQuality_video() {
        return quality_video;
    }

    public void setQuality_video(String quality_video) {
        this.quality_video = quality_video;
    }

    public String getQuality_audio() {
        return quality_audio;
    }

    public void setQuality_audio(String quality_audio) {
        this.quality_audio = quality_audio;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getSubtitle_language() {
        return subtitle_language;
    }

    public void setSubtitle_language(String subtitle_language) {
        this.subtitle_language = subtitle_language;
    }

    public String getLink_download() {
        return link_download;
    }

    public void setLink_download(String link_download) {
        this.link_download = link_download;
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

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }
    
    
}
