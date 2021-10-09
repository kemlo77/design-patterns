package creational.factorymethod.second.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

  String name;
  String dough;
  String sauce;
  List<String> toppings = new ArrayList<>();

  public void prepare() {
    System.out.println("Preparing: " + this.name);
    System.out.println("Tossing dough ...");
    System.out.println("Adding sauce....");
    System.out.println("Adding toppings:");
    toppings.forEach(it -> System.out.println("\t" + it));
  }

  public void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  public void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  public void box() {
    System.out.println("Place pizza in official PizzaStore box");
  }

  public String getName() {
    return this.name;
  }


}
