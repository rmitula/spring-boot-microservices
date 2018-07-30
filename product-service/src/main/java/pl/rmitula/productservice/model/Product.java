package pl.rmitula.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Document(collection = "products")
@Data
@Getter
@Setter
@AllArgsConstructor
public class Product implements Serializable {

    @Id
    private String id;

    @NotNull
    private String name;

    @NotNull
    private Integer quanityInStock;

    @NotNull
    private Double price;
}
