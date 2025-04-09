package com.jean.cardapio.Repository;

import com.jean.cardapio.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
