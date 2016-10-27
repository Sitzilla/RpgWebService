package com.evansitzes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RpgWebServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RpgWebServiceApplication.class, args);

        System.out.print("Starting service!");
    }
}
