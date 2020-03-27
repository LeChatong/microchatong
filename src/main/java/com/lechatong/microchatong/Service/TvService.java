/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lechatong.microchatong.Service;

import com.lechatong.microchatong.Model.TvModel;
import com.lechatong.microchatong.Repository.TvRepository;
import com.lechatong.microchatong.utils.APIResponse;
import com.lechatong.microchatong.utils.ResponseCode;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class TvService {

    @Autowired
    private TvRepository tvRepo;
    
    public APIResponse getAllTv() {
        APIResponse resp = new APIResponse();
        List<TvModel> list_tvs = new ArrayList<TvModel>();
        
        try {
            list_tvs = tvRepo.findAll();
            if(!list_tvs.isEmpty()){
                resp.setData(list_tvs);
                resp.setStatus(ResponseCode.SUCCESS);
            }else{
                resp.setData(list_tvs);
                resp.setStatus(ResponseCode.NOT_FOUND);
            }
        } catch (Exception e) {
            resp.setData(null);
            resp.setMessage(e.getMessage());
            resp.setStatus(ResponseCode.SERVER_ERROR);
        }
        
        return resp;
    }

    public APIResponse getTvById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public APIResponse findTvByTitle(String title) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public APIResponse getAllTvAvaible() {
        APIResponse resp = new APIResponse();
        List<TvModel> list_tvs = new ArrayList<TvModel>();
        
        try {
            list_tvs = tvRepo.findAllTvAvaible();
            if(!list_tvs.isEmpty()){
                resp.setData(list_tvs);
                resp.setStatus(ResponseCode.SUCCESS);
            }else{
                resp.setData(list_tvs);
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
