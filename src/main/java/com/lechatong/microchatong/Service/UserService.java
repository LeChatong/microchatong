package com.lechatong.microchatong.Service;

import com.lechatong.microchatong.Model.UserModel;
import com.lechatong.microchatong.Repository.UserRepository;
import com.lechatong.microchatong.utils.APIResponse;
import com.lechatong.microchatong.utils.ResponseCode;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<UserModel> getAllUsers() {
        APIResponse resp = new APIResponse();
        List<UserModel> users = new ArrayList<UserModel>();
        try{
            users = userRepository.findAll();
        }catch(Exception e){
            users = null;
        }
        return users;
    }

    public APIResponse getOneUser(int id) {
        APIResponse resp = new APIResponse();
        try{
            UserModel user = userRepository.findById(id);
            if(user != null){
                resp.setData(user);
                resp.setStatus(ResponseCode.SUCCESS);
            }else{
                resp.setData(user);
                resp.setStatus(ResponseCode.NOT_FOUND);
            }
        }catch(Exception e){
            resp.setData(null);
            resp.setMessage(e.getMessage());
            resp.setStatus(ResponseCode.SERVER_ERROR);
        }
        return resp;
    }

    public APIResponse searchUserByUsername(String search) {
        APIResponse resp = new APIResponse();
        List<UserModel> users = new ArrayList<UserModel>();
        try{
            users = userRepository.findAllByUsernameLike('%'+search+'%');
            if(!users.isEmpty()){
                resp.setData(users);
                resp.setStatus(ResponseCode.SUCCESS);
            }else{
                resp.setData(users);
                resp.setStatus(ResponseCode.NOT_FOUND);
            }
        }catch(Exception e){
            resp.setData(null);
            resp.setMessage(e.getMessage());
            resp.setStatus(ResponseCode.SERVER_ERROR);
        }
        return resp;
    }

    public UserModel searchUser(String username, String email) {
        UserModel user = new UserModel();
        try{
            user = userRepository.searchUser(username, email);
            
        }catch(Exception e){
            user = null;
        }
        return user;
    }
    
    
}
