package com.rodrigotroy.bootingweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootingWebApplication {

    public static void main(String[] args) {
        try (ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(BootingWebApplication.class,
                                                                                                   args)) {
            System.out.println("initializing...");
        }
    }

}
