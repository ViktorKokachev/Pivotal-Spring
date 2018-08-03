package com.ps.config;

import com.ps.repo.stub.StubPetRepo;
import com.ps.repos.PetRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by iuliana.cosmina on 4/17/16.
 */
@Configuration
@ComponentScan(basePackages = "com.ps.repo.stub")
public class TestAppConfig {

    @Bean
    public PetRepo petRepo(){
        return new StubPetRepo();
    }
}
