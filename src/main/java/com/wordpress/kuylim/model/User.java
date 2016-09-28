/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.kuylim.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author KUYLIM
 */
@Document(collection = "users")
public class User {
    @Id
    private String id;
    
    private String name;
    
    private String email;
    
    @Transient
    private List<String> tmproles;
    
    @DBRef
    private List<Role> role;
    
    public User() 
    {
        
    }
    
    public User(String name, String email)
    {
        this.name  = name;
        this.email = email;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the role
     */
    public List<Role> getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(List<Role> role) {
        this.role = role;
    }

    /**
     * @return the tmproles
     */
    public List<String> getTmproles() {
        return tmproles;
    }

    /**
     * @param tmproles the tmproles to set
     */
    public void setTmproles(List<String> tmproles) {
        this.tmproles = tmproles;
    }
}
