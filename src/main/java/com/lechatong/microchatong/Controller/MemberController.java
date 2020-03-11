/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lechatong.microchatong.Controller;

import com.lechatong.microchatong.Service.MemberService;
import com.lechatong.microchatong.utils.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LeChatong
 */

@RestController
@RequestMapping("microchatong/member")
public class MemberController {
    
    @Autowired
    private MemberService service;
    
    @GetMapping(value = "/list")
    public APIResponse getAllMembers(){
        return service.findAllMembers() ;
    }

    @GetMapping(value = "/{id}")
    public APIResponse getOneMember(@PathVariable int id){
        return service.findMemberById(id);
    }

    @PostMapping(value = "/search")
    public APIResponse search(String search){
        return  service.searchMember(search);
    }
}
