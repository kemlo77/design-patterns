package creational.factorymethod.second.pizza;

public class NYPepperoniPizza extends Pizza {

  public NYPepperoniPizza() {
    this.name = "NY Style Sauce and Pepperoni Pizza";
    this.dough = "Thin Crust Dough";
    this.sauce = "Marinara Sauce";
    this.toppings.add("Grated Reggiano Cheeze");
    this.toppings.add("Pepperoni");
  }

}
