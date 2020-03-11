/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lechatong.microchatong.Service;

import com.lechatong.microchatong.Model.MemberModel;
import com.lechatong.microchatong.Model.UserModel;
import com.lechatong.microchatong.Repository.MemberRepository;
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
public class MemberService {

    @Autowired
    private MemberRepository memberRepo;
    
    public APIResponse findAllMembers() {
        APIResponse resp = new APIResponse();
        List<MemberModel> list_member = new ArrayList<MemberModel>();
        try{
            list_member = memberRepo.findAll();
            if(!list_member.isEmpty()){
                resp.setData(list_member);
                resp.setStatus(ResponseCode.SUCCESS);
            }else{
                resp.setData(list_member);
                resp.setStatus(ResponseCode.NOT_FOUND);
            }
        }catch(Exception e){
            resp.setData(null);
            resp.setMessage(e.getMessage());
            resp.setStatus(ResponseCode.SERVER_ERROR);
        }
        return resp;
    }

    public APIResponse findMemberById(int id) {
        APIResponse resp = new APIResponse();
        MemberModel member = new MemberModel();
        try{
            member = memberRepo.findById(id);
            if(member != null){
                resp.setData(member);
                resp.setStatus(ResponseCode.SUCCESS);
            }else{
                resp.setData(member);
                resp.setStatus(ResponseCode.NOT_FOUND);
            }
        }catch(Exception e){
            resp.setData(null);
            resp.setMessage(e.getMessage());
            resp.setStatus(ResponseCode.SERVER_ERROR);
        }
        return resp;
    }

    public APIResponse searchMember(String search) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
