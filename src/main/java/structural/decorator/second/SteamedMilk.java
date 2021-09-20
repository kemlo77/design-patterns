package structural.decorator.second;

public class SteamedMilk extends CondimentsDecorator {

  public SteamedMilk(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + ", Steamed Milk";
  }

  @Override
  public double cost() {
    return this.beverage.cost() + .10;
  }
}
