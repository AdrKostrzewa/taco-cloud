package tacos;

import lombok.extern.slf4j.Slf4j;import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.*;
import java.util.stream.Collectors;
import tacos.Ingredient;
import tacos.Ingredient.Type;
@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

    @GetMapping
    public String showDesignForm (Model model){
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("1", "pszenna", Type.WRAP),
                new Ingredient("2", "kukurydziana", Type.WRAP),
                new Ingredient("3", "mielona wołowina", Type.PROTEIN),
                new Ingredient("4", "kawałki mięsa", Type.PROTEIN),
                new Ingredient("5", "burak", Type.VEGGIES),
                new Ingredient("6", "seler", Type.VEGGIES),
                new Ingredient("7", "gouda", Type.CHEESE),
                new Ingredient("8", "1000 wysp", Type.SAUCE),
                new Ingredient("9", "keczup", Type.SAUCE)
        );
        Type [] types = Ingredient.Type.values();
for(Type type : types){
    model.addAttribute(type.toString().toLowerCase());
}

        model.addAttribute("design", new Taco());

        return "design";
    }




}
