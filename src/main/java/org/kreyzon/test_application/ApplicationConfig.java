package org.kreyzon.test_application;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Configuration class for application-specific properties.
 * Maps the properties defined under the "application" section in the application.yml file.
 *
 * @author Lorenzo Orlando
 * @email orlandolorenzo@kreyzon.com
 */
@Component
@ConfigurationProperties(prefix = "application")
@Getter
@Setter
public class ApplicationConfig {

    /**
     * Property one for the application.
     */
    private String propertyOne;

    /**
     * Property two for the application.
     */
    private String propertyTwo;

    /**
     * Property three for the application.
     */
    private String propertyThree;
}
