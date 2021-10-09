package creational.factorymethod.second.pizza;

public class ChicagoGreekPizza extends Pizza {

  public ChicagoGreekPizza() {
    this.name = "Chicago Style Deep Dish Greek Pizza";
    this.dough = "Extra Thick Crust Dough";
    this.sauce = "Plum Tomato Sauce";
    this.toppings.add("Shredded Mozzarella Cheeze");
    this.toppings.add("Satsiki");
  }

  @Override
  public void cut() {
    System.out.println("Cutting the pizza into square slices");
  }

}
