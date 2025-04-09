package com.jean.cardapio.Controller;

import com.jean.cardapio.Model.Food;
import com.jean.cardapio.Repository.FoodRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food")
public class FoodController {

    private FoodRepository foodRepository;

    public FoodController(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @GetMapping

    public List<Food> foodList(){
        return foodRepository.findAll();
    }

    @PostMapping

    public Food addFood(@RequestBody Food food){
        return foodRepository.save(food);

    }

    @PutMapping("/{id}")

    public Food attFood(@PathVariable Long id , @RequestBody Food food){
        food.setId(id);
        return foodRepository.save(food);
    }
   @DeleteMapping("/{id}")

    public void deleteFood(@PathVariable Long id){
        foodRepository.deleteById(id);
   }

}
