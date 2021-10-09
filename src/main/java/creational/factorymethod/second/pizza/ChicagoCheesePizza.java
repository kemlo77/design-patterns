package creational.factorymethod.second.pizza;

public class ChicagoCheesePizza extends Pizza {

  public ChicagoCheesePizza() {
    this.name = "Chicago Style Deep Dish Cheeze Pizza";
    this.dough = "Extra Thick Crust Dough";
    this.sauce = "Plum Tomato Sauce";
    this.toppings.add("Shredded Mozzarella Cheeze");
  }

  @Override
  public void cut() {
    System.out.println("Cutting the pizza into square slices");
  }

}
