package com.io.github.pedroolivsz.cardapio.controller;

import com.io.github.pedroolivsz.cardapio.DTO.FoodRequestDTO;
import com.io.github.pedroolivsz.cardapio.DTO.FoodResponseDTO;
import com.io.github.pedroolivsz.cardapio.entity.Food;
import com.io.github.pedroolivsz.cardapio.repository.FoodRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    private final FoodRepository foodRepository;

    public FoodController(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/create")
    public void saveFood(@RequestBody FoodRequestDTO foodRequestDTO) {
        Food food = new Food(foodRequestDTO);

        foodRepository.save(food);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/getAll")
    public List<FoodResponseDTO> getAll() {
        return foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
    }
}
