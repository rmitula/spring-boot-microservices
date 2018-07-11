package pl.rmitula.productservice.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties()
public class ProductProperties {

    String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
