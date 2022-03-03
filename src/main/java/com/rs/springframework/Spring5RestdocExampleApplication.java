package com.rs.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.rs.springframework.web.mappers")
public class Spring5RestdocExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring5RestdocExampleApplication.class, args);
    }

}
