package com.sergio.thymeleaf.cocktails;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("")
public class CocktailController {
    private final CocktailService cocktailService;

    public CocktailController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }

    @GetMapping("")
    public String getAllCocktails(Model model) {
        List<Cocktail> cocktails = cocktailService.getCocktails();
        model.addAttribute("cocktails", cocktails);
        return "cocktail-list";
    }

    @GetMapping("/search")
    public String searchByIngredient(@RequestParam("ingredient") String ingredient, Model model) {
        List<Cocktail> cocktails = cocktailService.getCocktailByIngredient(ingredient);
        model.addAttribute("cocktails", cocktails);
        model.addAttribute("ingredient", ingredient);
        return "cocktail-list";
    }

    @GetMapping("/cocktail")
    public String viewCocktail(@RequestParam("name") String name, Model model) {
        Cocktail cocktail = cocktailService.getCocktailByName(name);
        model.addAttribute("cocktail", cocktail);
        return "cocktail-detail";
    }

}
