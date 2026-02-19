package com.io.github.pedroolivsz.cardapio.controller;

import com.io.github.pedroolivsz.cardapio.DTO.FoodResponseDTO;
import com.io.github.pedroolivsz.cardapio.entity.Food;
import com.io.github.pedroolivsz.cardapio.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodRepository foodRepository;

    @GetMapping("/getAll")
    public List<FoodResponseDTO> getAll() {
        List<FoodResponseDTO> foods = foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foods;
    }
}
