package com.example.jwt22a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity(debug = true)
public class Jwt22aApplication {

    public static void main(String[] args) {
        SpringApplication.run(Jwt22aApplication.class, args);
    }

}
