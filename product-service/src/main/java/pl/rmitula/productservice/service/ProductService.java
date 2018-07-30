package pl.rmitula.productservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.rmitula.productservice.model.Product;
import pl.rmitula.productservice.repository.ProductReactiveRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    private ProductReactiveRepository productRepository;

    @Autowired
    public ProductService(ProductReactiveRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Flux<Product> getAll() {
        return productRepository.findAll();
    }

    public Mono<Product> getOne(String id) {
        return productRepository.findById(id);
    }
}
