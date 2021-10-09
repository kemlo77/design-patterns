package creational.factorymethod.second.pizza;

public class NYVeggiePizza extends Pizza {

  public NYVeggiePizza() {
    this.name = "NY Style Sauce and Veggie Pizza";
    this.dough = "Thin Crust Dough";
    this.sauce = "Marinara Sauce";
    this.toppings.add("Grated Reggiano Cheeze");
    this.toppings.add("Vegetables");
  }

}
