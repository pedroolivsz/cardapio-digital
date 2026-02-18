package com.io.github.pedroolivsz.cardapio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "foods")
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String image;
    @Getter
    @Setter
    private BigDecimal price;

    public Food() {
    }

    public Food(Long id, String title, String image, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.price = price;
    }
}
