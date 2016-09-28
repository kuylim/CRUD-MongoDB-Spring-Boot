/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.kuylim.controller;

import com.wordpress.kuylim.model.Role;
import com.wordpress.kuylim.model.User;
import com.wordpress.kuylim.service.UserServices;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author KUYLIM
 */
@Controller
public class UserController {
    
    @Autowired
    private UserServices userService;
    
    // view user as json data
    @RequestMapping(value = "/show")
    public @ResponseBody List<User> showUser()
    {
        return userService.findAll();
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getuser(ModelMap model)
    {
        model.addAttribute("User", userService.findAll());                
        return "user";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute User user)
    {
        userService.save(user);
        return "redirect:/";
    }
    
    @RequestMapping(value = "/add-user")
    public String useradd()
    {
        return "user-add";
    }
    
    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") String id)
    { 
        userService.delete(id);
        return "redirect:/";
    }
    
     @RequestMapping(value = "/update/{id}")
    public String update(@PathVariable("id") String id, ModelMap model)
    {
        model.addAttribute("User", userService.findOne(id));
        return "user-update";
    }
    
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String edit(User user)
    {
        userService.update(user);
        return "redirect:/";
    }
    
    @RequestMapping(value = "/find-by-name")
    public @ResponseBody List<User> findByName()
    {
        return userService.findByName("kuylim");
    }
    
    @RequestMapping(value = "/find-by-role")
    public @ResponseBody List<User> findByRole()
    {
        Role role = new Role("1");
        return userService.findByRole(role);
    }
    
    @RequestMapping(value = "/find-by-email")
    public @ResponseBody List<User> findByEmail()
    {
        return userService.findByEmail("kuylim.tith@gmail.com");
    }
}
