package pl.rmitula.productservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private String id;
    private String name;
    private Integer quanityInStock;
    private Double price;
}
