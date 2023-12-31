package ro.sda.spring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Product {
    private String name;
    private int id;
    private String description;

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
