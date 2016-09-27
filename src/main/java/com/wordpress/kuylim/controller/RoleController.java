/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.kuylim.controller;

import com.wordpress.kuylim.model.Role;
import com.wordpress.kuylim.repository.RoleRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author KUYLIM
 */
@Controller
public class RoleController {
    
    @Autowired
    private RoleRepository roleRepo;
    
    /* if don't have role must add role first time */
//    @RequestMapping(value = "/add-role")
//    public String addRole()
//    {
//        List<Role> roles = new ArrayList<>();
//        
//        roles.add(new Role("1", "User"));
//        roles.add(new Role("2", "Admin"));
//        roles.add(new Role("3", "Developer"));
//        
//        for (int i = 0 ; i < roles.size() ;i ++)
//        {
//            roleRepo.save(roles.get(i));
//        }
//        return "index";
//    }
}
