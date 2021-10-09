package creational.factorymethod.second.pizza;

public class NYClamPizza extends Pizza {

  public NYClamPizza() {
    this.name = "NY Style Sauce and Clam Pizza";
    this.dough = "Thin Crust Dough";
    this.sauce = "Marinara Sauce";
    this.toppings.add("Grated Reggiano Cheeze");
    this.toppings.add("Clams");
  }


}
