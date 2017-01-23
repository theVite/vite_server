package com.vite;

import com.vite.service.ViteClient;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan({"com.vite.service"})
@SpringBootApplication
public class Application {
    static final Logger LOGGER = Logger.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        new ViteClient();
        LOGGER.info("Starting server...");
    }
}
