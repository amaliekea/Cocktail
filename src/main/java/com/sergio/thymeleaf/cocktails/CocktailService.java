package com.sergio.thymeleaf.cocktails;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CocktailService {
    CocktailRepository cocktailRepository = new CocktailRepository();

    public List<Cocktail> getCocktails() {
        return cocktailRepository.getCocktails();
    }

    public List<Cocktail> getCocktailByIngredient(String ingredient) {
        return cocktailRepository.getCocktailByIngredient(ingredient);
    }

    public Cocktail getCocktailByName(String name) {
        return cocktailRepository.getCocktailByName(name);
    }

    public HashMap<String, Integer> getGroceryList() {
        return cocktailRepository.getGroceryList();
    }
}
