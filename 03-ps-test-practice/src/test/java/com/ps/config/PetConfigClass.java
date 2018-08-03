package com.ps.config;

import com.ps.services.PetService;
import com.ps.services.impl.SimplePetService;
import org.springframework.context.annotation.Bean;

public class PetConfigClass {
    @Bean
    public PetService simplePetService() {
        return new SimplePetService();
    }
}
