package creational.factorymethod.second.pizza;

public class NYCheesePizza extends Pizza {

  public NYCheesePizza() {
    this.name = "NY Style Sauce and Cheeze Pizza";
    this.dough = "Thin Crust Dough";
    this.sauce = "Marinara Sauce";
    this.toppings.add("Grated Reggiano Cheeze");
  }

}
