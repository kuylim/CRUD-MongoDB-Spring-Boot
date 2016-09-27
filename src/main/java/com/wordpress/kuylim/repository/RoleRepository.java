/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.kuylim.repository;

import com.wordpress.kuylim.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author KUYLIM
 */
public interface RoleRepository  extends MongoRepository<Role, String>{
    
}
