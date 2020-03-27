/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lechatong.microchatong.Repository;

import com.lechatong.microchatong.Model.MovieModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LeChatong
 */
@Repository
public interface MovieRepository extends JpaRepository<MovieModel, Integer>{
    
    @Override
    public List<MovieModel> findAll();
    
    public MovieModel findById(int id);
    
    @Override
    public MovieModel save(MovieModel movie);
    
    @Query("SELECT m FROM lcu_movie_detail m WHERE LOWER(m.title_movie) LIKE LOWER(:title) ORDER BY m.title_movie")
    public List<MovieModel> findMovieByTitleMovieModels(@Param("title") String title);
}
