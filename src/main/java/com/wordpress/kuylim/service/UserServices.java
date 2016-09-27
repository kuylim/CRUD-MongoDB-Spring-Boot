/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.kuylim.service;

import com.wordpress.kuylim.model.Role;
import com.wordpress.kuylim.model.User;
import com.wordpress.kuylim.repository.UsersRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author KUYLIM
 */
@Service
public class UserServices {
    @Autowired
    private UsersRepository userRepo;
    
    Role role;
    
    public void save(User user)
    {
        List<Role> roles = new ArrayList<>();
        
        for(int i=0;i< user.getTmproles().size();i++)
        {
            role = new Role(user.getTmproles().get(i));
            roles.add(role);
        }
        
        user.setRole(roles);
        userRepo.save(user);   
    }
    
    public void delete(String id)
    {
        userRepo.delete(id);
    }
    
    public void update(User user)
    {
        List<Role> roles = new ArrayList<>();
        
        for(int i=0;i< user.getTmproles().size();i++)
        {
            role = new Role(user.getTmproles().get(i));
            roles.add(role);
        }
        
        user.setRole(roles);
        userRepo.save(user);   
    }
    
    public List<User> findAll()
    {
        List<User> users = userRepo.findAll();
        return users;
    }
    
    public User findOne(String id)
    {
        return userRepo.findOne(id);
    }
}
