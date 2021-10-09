package creational.factorymethod.second;

import creational.factorymethod.second.pizza.Pizza;

public class Demo {

  public static void main(String[] args) {

    PizzaStore nyStore = new NYStylePizzaStore();
    PizzaStore chicagoStore = new ChicacoStylePizzaStore();

    Pizza pizza1 = nyStore.orderPizza("cheeze");
    Pizza pizza2 = chicagoStore.orderPizza("clam");

  }

}
