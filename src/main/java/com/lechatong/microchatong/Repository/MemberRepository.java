/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lechatong.microchatong.Repository;

import com.lechatong.microchatong.Model.MemberModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LeChatong
 */
@Repository
public interface MemberRepository extends JpaRepository<MemberModel, Integer>{
    
    public MemberModel findById(int id);
    @Override
    public List<MemberModel> findAll();
    @Override
    public MemberModel save(MemberModel Member);
}
