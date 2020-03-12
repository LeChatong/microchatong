/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lechatong.microchatong.Repository;

import com.lechatong.microchatong.Model.TvModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LeChatong
 */

@Repository
public interface TvRepository extends JpaRepository<TvModel, Integer>{
    
    @Override
    public List<TvModel> findAll();
    
    public TvModel findById(int id);
    
    @Override
    public TvModel save(TvModel tv);
    
    @Query(value = "SELECT DISTINCT ON (t.id_tv) t.id, t.id_tv, t.nb_season, t.nb_episode, t.title_tv, t.link_download, t.voice_language,"
            + "t.quality_video, t.quality_audio, t.subtitle, t.subtitle_language, t.member_id, t.created_at,"
            + "t.updated_at FROM lcu_tv_detail t ORDER BY t.id_tv ASC, t.title_tv", nativeQuery = true)
    public List<TvModel> findAllTvAvaible();
}
