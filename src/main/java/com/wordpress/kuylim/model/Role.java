/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.kuylim.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author KUYLIM
 */
@Document(collection = "roles")
public class Role {
    
    @Id
    private String roleid;
    private String Rolename;
    
    
    public Role() {}
    
    public Role(String id ,String rolename)
    {
        this.roleid = id;
        this.Rolename = rolename;
    }
    
    public Role(String id)
    {
        this.roleid = id;
    }


    /**
     * @return the Rolename
     */
    public String getRolename() {
        return Rolename;
    }

    /**
     * @param Rolename the Rolename to set
     */
    public void setRolename(String Rolename) {
        this.Rolename = Rolename;
    }

    /**
     * @return the roleid
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * @param roleid the roleid to set
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }
}
