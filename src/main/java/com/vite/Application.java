package com.vite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import sun.rmi.rmic.Main;

@EnableWebMvc
@ComponentScan(basePackages = {"com.vite.service"})
@SpringBootApplication
public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.debug("Starting Server....");

        ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
    }
}
