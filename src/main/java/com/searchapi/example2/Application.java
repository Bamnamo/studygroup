package com.searchapi.example2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages ={"com.search.example2.web"} )
public class Application {
    public static void main(String[]args){
        SpringApplication.run(Application.class, args);
    }
}
