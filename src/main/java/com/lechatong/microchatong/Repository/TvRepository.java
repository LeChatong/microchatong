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
    
    @Query("SELECT DISTINCT t.id_tv FROM lcu_tv_detail t")
    public List<TvModel> findAllTvAvaible();
}
