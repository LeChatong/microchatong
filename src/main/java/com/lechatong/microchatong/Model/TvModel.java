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
@Entity(name = "lcu_tv_detail")
public class TvModel implements Serializable {
    @Id
    @Column(name = "id")
    private int id;
    
    @Column(name = "id_tv")
    private int id_tv;
    
    @Column(name = "nb_season")
    private int nb_season;
    
    @Column(name = "nb_episode")
    private int nb_episode;
    
    @Column(name = "title_tv")
    private String title_tv;
    
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

    public TvModel() {
    }

    public TvModel(int id, int id_tv, int nb_season, int nb_episode, String title_tv, String link_download, 
            String voice_language, String quality_video, String quality_audio, String subtitle, String subtitle_language, 
            Date created_at, Date updated_at, int member_id) {
        this.id = id;
        this.id_tv = id_tv;
        this.nb_season = nb_season;
        this.nb_episode = nb_episode;
        this.title_tv = title_tv;
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

    public int getId_tv() {
        return id_tv;
    }

    public void setId_tv(int id_tv) {
        this.id_tv = id_tv;
    }

    public int getNb_season() {
        return nb_season;
    }

    public void setNb_season(int nb_season) {
        this.nb_season = nb_season;
    }

    public int getNb_episode() {
        return nb_episode;
    }

    public void setNb_episode(int nb_episode) {
        this.nb_episode = nb_episode;
    }

    public String getTitle_tv() {
        return title_tv;
    }

    public void setTitle_tv(String title_tv) {
        this.title_tv = title_tv;
    }

    public String getLink_download() {
        return link_download;
    }

    public void setLink_download(String link_download) {
        this.link_download = link_download;
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
