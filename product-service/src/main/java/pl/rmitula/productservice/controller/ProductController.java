package pl.rmitula.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rmitula.productservice.properties.ProductProperties;

import java.util.logging.Logger;

@RestController
public class ProductController {

    private static final Logger LOG = Logger.getLogger(ProductController.class.getName());

    private ProductProperties productProperties;

    public ProductController(ProductProperties productProperties) {
        this.productProperties = productProperties;
    }

    @GetMapping("greeting")
    public String greeting() {
        LOG.info(productProperties.getGreeting());
        return productProperties.getGreeting();
    }
    
}
