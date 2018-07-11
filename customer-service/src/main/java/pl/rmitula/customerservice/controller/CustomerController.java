package pl.rmitula.customerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rmitula.customerservice.properties.CustomerProperties;

import java.util.logging.Logger;

@RestController
public class CustomerController {

    private static final Logger LOG = Logger.getLogger(CustomerController.class.getName());

    private CustomerProperties customerProperties;

    public CustomerController(CustomerProperties customerProperties) {
        this.customerProperties = customerProperties;
    }

    @GetMapping
    public String greeting() {
        LOG.info(customerProperties.getGreeting());
        return customerProperties.getGreeting();
    }
}
