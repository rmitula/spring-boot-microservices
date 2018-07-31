package pl.rmitula.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.rmitula.productservice.model.Product;
import pl.rmitula.productservice.model.converter.Converter;
import pl.rmitula.productservice.model.dto.ProductDTO;
import pl.rmitula.productservice.properties.ProductProperties;
import pl.rmitula.productservice.service.ProductService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@RestController
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
    @Deprecated
    public String greeting() {
        LOG.info(productProperties.getGreeting());
        return productProperties.getGreeting();
    }

    @GetMapping
    public Flux<ProductDTO> getAllProducts() {
        LOG.info("return list of products");
        return productService.getAll().map(Converter::toProductDto);
    }

    @GetMapping("{id}")
    public Mono<ProductDTO> getOneProduct(@PathVariable String id) {
        LOG.info("return product with id: " + id);
        return productService.getOne(id).map(Converter::toProductDto);
    }

    @PostMapping
    public Mono<ProductDTO> saveProduct(@Valid @RequestBody final Product product) {
        LOG.info("saving product: " + product.toString());
        return productService.save(product).map(Converter::toProductDto);
    }

    @DeleteMapping(value = "{id}")
    public void deleteProduct(@PathVariable String id) {
        LOG.info("delete product with id: " + id);
        productService.delete(id);
    }

}
