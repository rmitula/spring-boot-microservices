package pl.rmitula.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rmitula.orderservice.service.CustomerService;
import pl.rmitula.orderservice.service.ProductService;

import java.util.logging.Logger;

@RestController
public class OrderController {

    private static final Logger LOG = Logger.getLogger(OrderController.class.getName());

    CustomerService customerService;
    ProductService productService;

    @Autowired
    public OrderController(CustomerService customerService, ProductService productService) {
        this.customerService = customerService;
        this.productService = productService;
    }

    @GetMapping
    public String greeting() {
        String greeting = new StringBuilder().append(customerService.getGreeting()).append(" ").append(productService.getGreeting()).toString();
        LOG.info(greeting);
        return greeting;
    }
}
