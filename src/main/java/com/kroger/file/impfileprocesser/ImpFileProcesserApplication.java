package com.kroger.file.impfileprocesser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ImpFileProcesserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImpFileProcesserApplication.class, args);
    }
}
