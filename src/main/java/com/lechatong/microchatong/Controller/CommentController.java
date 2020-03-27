/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lechatong.microchatong.Controller;

import com.lechatong.microchatong.Service.CommentService;
import com.lechatong.microchatong.utils.APIResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LeChatong
 */
@Api(description = "API pour les actions CRUD sur les commentaires de l'application LeChatongUniverse")
@RestController
@RequestMapping("microchatong/comment")
public class CommentController {
    
    @Autowired
    private CommentService service;

    @ApiOperation(value = "Liste tout les commentaires disponible.")
    @GetMapping("/list")
    public APIResponse getAllCOmment(){
        return service.findAllComment();
    }
}
