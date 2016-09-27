/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.kuylim.configuration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import static java.util.Collections.singletonList;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 *
 * @author KUYLIM
 */
@Configuration
@PropertySource(value={"classpath:mongodb.properties"})
@EnableMongoRepositories(basePackages = "com.wordpress.kuylim.repository")
public class MongoConfig  extends AbstractMongoConfiguration{

    
    @Value("${spring.data.mongodb.host}")
    private String host;
    
    @Value("${spring.data.mongodb.port}")
    private Integer port;
    
    @Value("${spring.data.mongodb.database}")
    private String database;
    
    @Value("${spring.data.mongodb.username}")
    private String username;
    
    @Value("${spring.data.mongodb.password}")
    private String password;
    
    
    @Override
    protected String getDatabaseName() {
        return database;
    }

    @Override
    @Bean
    public Mongo mongo() throws Exception {
        return new MongoClient(singletonList(new ServerAddress(host,port)), 
                singletonList(MongoCredential.createCredential(username, database, password.toCharArray()))); 
    }
    
    @Override
    protected String getMappingBasePackage()
    {
        return "com.wordpress.kuylim";
    }
    
    
}
