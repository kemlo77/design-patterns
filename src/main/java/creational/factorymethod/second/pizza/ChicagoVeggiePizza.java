package creational.factorymethod.second.pizza;

public class ChicagoVeggiePizza extends Pizza {

  public ChicagoVeggiePizza() {
    this.name = "Chicago Style Deep Dish Vegie Pizza";
    this.dough = "Extra Thick Crust Dough";
    this.sauce = "Plum Tomato Sauce";
    this.toppings.add("Shredded Mozzarella Cheeze");
    this.toppings.add("Vegetables");
  }

  @Override
  public void cut() {
    System.out.println("Cutting the pizza into square slices");
  }

}
