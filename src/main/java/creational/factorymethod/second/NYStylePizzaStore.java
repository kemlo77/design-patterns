package creational.factorymethod.second;

import creational.factorymethod.second.pizza.DefaultPizza;
import creational.factorymethod.second.pizza.NYCheesePizza;
import creational.factorymethod.second.pizza.NYClamPizza;
import creational.factorymethod.second.pizza.NYGreekPizza;
import creational.factorymethod.second.pizza.NYPepperoniPizza;
import creational.factorymethod.second.pizza.NYVeggiePizza;
import creational.factorymethod.second.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {
    if (type.equals("cheeze")) {
      return new NYCheesePizza();
    }
    if (type.equals("greek")) {
      return new NYGreekPizza();
    }
    if (type.equals("pepperoni")) {
      return new NYPepperoniPizza();
    }
    if (type.equals("clam")) {
      return new NYClamPizza();
    }
    if (type.equals("veggie")) {
      return new NYVeggiePizza();
    }

    return new DefaultPizza();
  }
}
