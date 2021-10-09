package creational.factorymethod.second.pizza;

public class ChicagoClamPizza extends Pizza {

  public ChicagoClamPizza() {
    this.name = "Chicago Style Deep Dish Clam Pizza";
    this.dough = "Extra Thick Crust Dough";
    this.sauce = "Plum Tomato Sauce";
    this.toppings.add("Shredded Mozzarella Cheeze");
    this.toppings.add("Clams");
  }

  @Override
  public void cut() {
    System.out.println("Cutting the pizza into square slices");
  }

}
