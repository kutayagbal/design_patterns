package gof.creational.abstract_factory.region;

import java.util.List;

import gof.creational.abstract_factory.ingredient.cheese.Cheese;
import gof.creational.abstract_factory.ingredient.dough.Dough;
import gof.creational.abstract_factory.ingredient.sauce.Sauce;
import gof.creational.abstract_factory.ingredient.seafood.Seafood;

public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Seafood createSeafood();

    public List<String> createVeggies();

    public String getStyle();

}
