package creational.factorymethod.second.pizza;

public class NYGreekPizza extends Pizza {

  public NYGreekPizza() {
    this.name = "NY Style Sauce and Greek Pizza";
    this.dough = "Thin Crust Dough";
    this.sauce = "Marinara Sauce";
    this.toppings.add("Grated Reggiano Cheeze");
    this.toppings.add("Satsiki");
  }

}
