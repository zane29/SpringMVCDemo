package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.io.IOException;

@SpringBootApplication
@ServletComponentScan
@EnableJpaAuditing
public class SpirngbootdemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpirngbootdemoApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpirngbootdemoApplication.class);
    }
}
