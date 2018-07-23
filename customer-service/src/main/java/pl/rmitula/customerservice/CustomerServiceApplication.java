package pl.rmitula.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import pl.rmitula.customerservice.properties.CustomerProperties;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties(CustomerProperties.class)
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
}
