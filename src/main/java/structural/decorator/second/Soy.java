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
    double calculatedCost = this.beverage.cost();
    switch (this.beverage.getSize()) {
      case TALL: calculatedCost+= .10; break;
      case GRANDE: calculatedCost += .15; break;
      case VENTI: calculatedCost += .20; break;
    }
    return calculatedCost;
  }

}
