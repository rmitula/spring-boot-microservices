package pl.rmitula.productservice.model.converter;

import pl.rmitula.productservice.model.Product;
import pl.rmitula.productservice.model.dto.ProductDTO;

public class Converter {

    public static Product fromProductDto(ProductDTO productDTO) {
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setName(productDTO.getName());
        product.setQuanityInStock(productDTO.getQuanityInStock());
        product.setPrice(productDTO.getPrice());
        return product;
    }

    public static ProductDTO toProductDto(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setQuanityInStock(product.getQuanityInStock());
        productDTO.setPrice(product.getPrice());
        return productDTO;
    }
}
