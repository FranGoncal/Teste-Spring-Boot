package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguracao {
    @Bean(name = "nome.app")
    public String getNomeAplicacao(){
            return "App Ola Mundo!";
    }
}