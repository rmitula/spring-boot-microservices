package pl.rmitula.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.rmitula.productservice.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
