package com.sergio.thymeleaf.cocktails;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CocktailRepository {
    private List<Cocktail> cocktails;

    public CocktailRepository() {
        cocktails = new ArrayList<>();
        cocktails.add(new Cocktail("Mohito", Arrays.asList(new Ingredient("Vodka"), new Ingredient("Mynthe"), new Ingredient("sugar"))));
        cocktails.add(new Cocktail("Sodavand", Arrays.asList(new Ingredient("vand"), new Ingredient("Sukker"))));
        cocktails.add(new Cocktail("Pina Colada", Arrays.asList(new Ingredient("rom"), new Ingredient("malibu"))));
        cocktails.add(new Cocktail("skinny b", Arrays.asList(new Ingredient("vand"), new Ingredient("vodka"))));
    }

    public List<Cocktail> getCocktails() {
        return cocktails;
    }

    public List<Cocktail> getCocktailByIngredient(String ingredient) {
        List<Cocktail> cocktailsByIngredients = new ArrayList<>();
        for (Cocktail c : cocktails) {
            for (Ingredient i : c.getIngredients()) {
                if (i.getName().equals(ingredient)) {
                    cocktailsByIngredients.add(c);
                }
            }
        }
        return cocktailsByIngredients;
    }

    public Cocktail getCocktailByName(String name) {
        for (Cocktail c : cocktails) {
            if(c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }
}
