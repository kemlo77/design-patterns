package creational.factorymethod.second.pizza;

public class ChicagoPepperoniPizza extends Pizza {

  public ChicagoPepperoniPizza() {
    this.name = "Chicago Style Deep Dish Peperoni Pizza";
    this.dough = "Extra Thick Crust Dough";
    this.sauce = "Plum Tomato Sauce";
    this.toppings.add("Shredded Mozzarella Cheeze");
    this.toppings.add("Peperoni");
  }

  @Override
  public void cut() {
    System.out.println("Cutting the pizza into square slices");
  }

}
