package gof.creational.abstract_factory.region;

import java.util.List;

import gof.creational.abstract_factory.ingredient.cheese.Cheese;
import gof.creational.abstract_factory.ingredient.cheese.Mozzarella;
import gof.creational.abstract_factory.ingredient.dough.Dough;
import gof.creational.abstract_factory.ingredient.dough.ThickCrustDough;
import gof.creational.abstract_factory.ingredient.sauce.PlumTomatoSauce;
import gof.creational.abstract_factory.ingredient.sauce.Sauce;
import gof.creational.abstract_factory.ingredient.seafood.Seafood;
import gof.creational.abstract_factory.ingredient.seafood.Shrimp;

public class LAPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Seafood createSeafood() {
        return new Shrimp();
    }

    @Override
    public List<String> createVeggies() {
        System.out.println("Adding Veggies: BlackOlives, Spinach, Eggplant");
        return List.of("BlackOlives", "Spinach", "Eggplant");
    }

    @Override
    public String getStyle() {
        return "Los Angeles Style";
    }
}
