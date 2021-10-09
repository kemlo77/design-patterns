package creational.factorymethod.second;

import creational.factorymethod.second.pizza.ChicagoCheesePizza;
import creational.factorymethod.second.pizza.ChicagoClamPizza;
import creational.factorymethod.second.pizza.ChicagoGreekPizza;
import creational.factorymethod.second.pizza.ChicagoPepperoniPizza;
import creational.factorymethod.second.pizza.ChicagoVeggiePizza;
import creational.factorymethod.second.pizza.DefaultPizza;
import creational.factorymethod.second.pizza.Pizza;

public class ChicacoStylePizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {
    switch (type) {
      case "cheeze":
        return new ChicagoCheesePizza();
      case "greek":
        return new ChicagoGreekPizza();
      case "pepperoni":
        return new ChicagoPepperoniPizza();
      case "clam":
        return new ChicagoClamPizza();
      case "veggie":
        return new ChicagoVeggiePizza();
      default:
        return new DefaultPizza();
    }
  }
}
