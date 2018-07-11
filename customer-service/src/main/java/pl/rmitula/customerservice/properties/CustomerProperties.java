package pl.rmitula.customerservice.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties()
public class CustomerProperties {

    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
