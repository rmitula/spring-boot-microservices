package pl.rmitula.productservice.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import pl.rmitula.productservice.model.Product;

@Repository
public interface ProductReactiveRepository extends ReactiveCrudRepository<Product, String> {
}
