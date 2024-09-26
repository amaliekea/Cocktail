package com.sergio.thymeleaf.cocktails;

import java.util.List;

public class Cocktail {
    private String name;
    final private List<Ingredient> ingredients;

    public Cocktail(String name, List<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}
