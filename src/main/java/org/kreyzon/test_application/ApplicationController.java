package org.kreyzon.test_application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for handling application-specific requests.
 *
 * @author Lorenzo Orlando
 * @email orlandolorenzo@kreyzon.com
 */
@RestController
@RequestMapping
@Slf4j
public class ApplicationController {

    @Value("${application.property-one}")
    private String propertyOne;

    @Value("${application.property-two}")
    private String propertyTwo;

    @Value("${application.property-three}")
    private String propertyThree;


    /**
     * Endpoint to return a simple greeting message.
     *
     * @return A greeting message.
     */
    @RequestMapping("/greet")
    public String greet() {
        log.info("Greet endpoint called");
        return "Hello, welcome to the Test Application! \n" +
               "Property One: " + propertyOne + "\n" +
               "Property Two: " + propertyTwo + "\n" +
               "Property Three: " + propertyThree + "\n";
    }
}
