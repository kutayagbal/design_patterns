package gof.creational.abstract_factory.region;

import java.util.List;

import gof.creational.abstract_factory.ingredient.cheese.Cheese;
import gof.creational.abstract_factory.ingredient.cheese.GoatCheese;
import gof.creational.abstract_factory.ingredient.dough.Dough;
import gof.creational.abstract_factory.ingredient.dough.ThinCrustDough;
import gof.creational.abstract_factory.ingredient.sauce.MarinaraSauce;
import gof.creational.abstract_factory.ingredient.sauce.Sauce;
import gof.creational.abstract_factory.ingredient.seafood.Clams;
import gof.creational.abstract_factory.ingredient.seafood.Seafood;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Seafood createSeafood() {
        return new Clams();
    }

    @Override
    public List<String> createVeggies() {
        System.out.println("Adding Veggies: Garlic, Onion, Mushroom, Red Pepper");
        return List.of("Garlic", "Onion", "Mushroom", "Red Pepper");
    }

    @Override
    public String getStyle() {
        return "New York Style";
    }

}
