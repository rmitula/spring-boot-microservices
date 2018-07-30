package pl.rmitula.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import pl.rmitula.productservice.model.Product;
import pl.rmitula.productservice.properties.ProductProperties;
import pl.rmitula.productservice.repository.ProductReactiveRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoRepositories
@EnableConfigurationProperties(ProductProperties.class)
public class ProductServiceApplication implements CommandLineRunner {

	@Autowired
	private ProductReactiveRepository productReactiveRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		productReactiveRepository.save(new Product("1", "Air Max 1", 10, 203.23)).then().block();
		productReactiveRepository.save(new Product("2", "Vans", 120, 123.00)).then().block();
	}
}
