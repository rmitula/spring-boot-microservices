package pl.rmitula.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rmitula.productservice.model.Product;
import pl.rmitula.productservice.properties.ProductProperties;
import pl.rmitula.productservice.service.ProductService;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/product")
public class ProductController {

    private static final Logger LOG = Logger.getLogger(ProductController.class.getName());

    private ProductProperties productProperties;
    private ProductService productService;

    @Autowired
    public ProductController(ProductProperties productProperties, ProductService productService) {
        this.productProperties = productProperties;
        this.productService = productService;
    }

    @GetMapping("greeting")
    public String greeting() {
        LOG.info(productProperties.getGreeting());
        return productProperties.getGreeting();
    }

    //-----------

    @GetMapping
    public List<Product> getAll() {
        LOG.info("displaying list of products.");
        return productService.getAll();
    }

}
