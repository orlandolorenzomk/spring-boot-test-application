package org.kreyzon.test_application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * This application is a simple Spring Boot application that serves as a test case for SpringOps project
 *
 * @author Lorenzo Orlando
 * @email orlandolorenzo@kreyzon.com
 */
@SpringBootApplication
@Slf4j
public class Application {

    public static void main(String[] args) {
        // Start the Spring application and retrieve the application context
        ApplicationContext context = SpringApplication.run(Application.class, args);

        // Retrieve the ApplicationConfig bean from the context
        ApplicationConfig applicationConfig = context.getBean(ApplicationConfig.class);

        // Log the application properties for debugging purposes
        log.info("Starting Test Application with properties:");
        log.info("Property One: {}", applicationConfig.getPropertyOne());
        log.info("Property Two: {}", applicationConfig.getPropertyTwo());
        log.info("Property Three: {}", applicationConfig.getPropertyThree());
    }
}