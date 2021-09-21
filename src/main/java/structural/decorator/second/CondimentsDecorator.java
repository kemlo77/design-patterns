package structural.decorator.second;

public abstract class CondimentsDecorator extends Beverage{

  Beverage beverage;
  public abstract String getDescription();

  public Size getSize() {
    return this.beverage.getSize();
  }

}
