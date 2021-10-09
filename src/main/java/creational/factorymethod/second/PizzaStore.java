package creational.factorymethod.second;

import creational.factorymethod.second.pizza.Pizza;


public abstract class PizzaStore {


  public Pizza orderPizza(String type) {
    Pizza pizza = this.createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    System.out.println("Delivering: " + pizza.getName());

    return pizza;
  }

  abstract Pizza createPizza(String type);

}
