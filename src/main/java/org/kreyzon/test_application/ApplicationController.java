package org.kreyzon.test_application;

import lombok.extern.slf4j.Slf4j;
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

    /**
     * Endpoint to return a simple greeting message.
     *
     * @return A greeting message.
     */
    @RequestMapping("/greet")
    public String greet() {
        log.info("Greet endpoint called");
        return "Hello from Madalina! This is a test application for SpringOps project.";
    }
}
