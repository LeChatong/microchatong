/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lechatong.microchatong.Service;

import com.lechatong.microchatong.Model.CommentModel;
import com.lechatong.microchatong.Repository.CommentRepository;
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
public class CommentService {

    @Autowired
    private CommentRepository repo;
    
    public APIResponse findAllComment() {
        APIResponse resp = new APIResponse();
        List<CommentModel> list_comment = new ArrayList<>();
        try {
            list_comment = repo.findAll();
            if(!list_comment.isEmpty()){
                resp.setData(list_comment);
                resp.setStatus(ResponseCode.SUCCESS);
            }else{
                resp.setData(null);
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
