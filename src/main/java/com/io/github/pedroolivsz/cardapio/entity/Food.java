package com.io.github.pedroolivsz.cardapio.entity;

import com.io.github.pedroolivsz.cardapio.DTO.FoodRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;

    public Food(FoodRequestDTO foodRequestDTO) {
        this.title = foodRequestDTO.title();
        this.image = foodRequestDTO.image();
        this.price = foodRequestDTO.price();
    }
}
