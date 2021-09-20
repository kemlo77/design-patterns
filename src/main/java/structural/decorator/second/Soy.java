package structural.decorator.second;

public class Soy extends CondimentsDecorator {

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + ", Soy";
  }

  @Override
  public double cost() {
    return this.beverage.cost() + .15;
  }

}
