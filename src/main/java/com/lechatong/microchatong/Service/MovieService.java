/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lechatong.microchatong.Service;

import com.lechatong.microchatong.Model.MovieModel;
import com.lechatong.microchatong.Repository.MovieRepository;
import com.lechatong.microchatong.utils.APIResponse;
import com.lechatong.microchatong.utils.ResponseCode;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LeChatong
 */
@Service
public class MovieService {
    
    @Autowired
    private MovieRepository mRepo;
    
    public APIResponse getAllMovies(){
        APIResponse resp = new APIResponse();
        List<MovieModel> list_movies = new ArrayList<MovieModel>();
        try {
            list_movies= mRepo.findAll();
            if(!list_movies.isEmpty()){
                resp.setData(list_movies);
                resp.setStatus(ResponseCode.SUCCESS);
            }else{
                resp.setData(list_movies);
                resp.setStatus(ResponseCode.NOT_FOUND);
            }
        } catch (Exception e) {
            resp.setData(null);
            resp.setMessage(e.getMessage());
            resp.setStatus(ResponseCode.SERVER_ERROR);
        }
        
        return resp;
    }
    
    public APIResponse saveMovie(MovieModel movie){
        APIResponse resp = new APIResponse();
        MovieModel movie_saving = new MovieModel();
        try {
            movie_saving = mRepo.save(movie);
            resp.setData(movie_saving);
            resp.setStatus(ResponseCode.SUCCESS);
        } catch (Exception e) {
            resp.setData(null);
            resp.setMessage(e.getMessage());
            resp.setStatus(ResponseCode.SERVER_ERROR);
        }
        return resp;
    }
    
    public APIResponse getMovieById(int id){
        APIResponse resp = new APIResponse();
        MovieModel movie = new MovieModel();
        try {
            movie = mRepo.findById(id);
            if(movie != null){
                resp.setData(movie);
                resp.setStatus(ResponseCode.SUCCESS);
            }else{
                resp.setData(movie);
                resp.setStatus(ResponseCode.NOT_FOUND);
                resp.setMessage("Aucune donnée trouvée !");
            }
        } catch (Exception e) {
            resp.setData(movie);
            resp.setStatus(ResponseCode.SERVER_ERROR);
            resp.setMessage(e.getMessage());
        }
        return resp;
    }
    
    public APIResponse findMovieByTitle(String title){
        APIResponse resp = new APIResponse();
        List<MovieModel> list_movies = new ArrayList<MovieModel>();
        
        try {
            list_movies = mRepo.findMovieByTitleMovieModels("%"+title+"%");
            if(!list_movies.isEmpty()){
                resp.setData(list_movies);
                resp.setStatus(ResponseCode.SUCCESS);
            }else{
                resp.setData(list_movies);
                resp.setStatus(ResponseCode.NOT_FOUND);
            }
        } catch (Exception e) {
            resp.setData(null);
            resp.setMessage(e.getMessage());
            resp.setStatus(ResponseCode.SERVER_ERROR);
        }
        
        return resp;
    }
}
