package structural.decorator.second;

public class Mocha extends CondimentsDecorator {

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + ", Mocha";
  }

  @Override
  public double cost() {
    return this.beverage.cost() + .20;
  }

}
