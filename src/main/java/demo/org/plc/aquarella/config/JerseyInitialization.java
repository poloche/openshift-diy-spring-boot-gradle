package demo.org.plc.aquarella.config;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author poloche
 */
public class JerseyInitialization extends ResourceConfig {
    /**
     * Register JAX-RS application components.
     */
    public JerseyInitialization() {
        this.packages("org.plc.aquarella.service");
    }
}
