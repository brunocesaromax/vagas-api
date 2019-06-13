package com.vagas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.vagas.model"})  // scan JPA entities
public class VagasApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(VagasApiApplication.class, args);
    }

}
