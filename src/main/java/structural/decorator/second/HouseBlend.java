package structural.decorator.second;

public class HouseBlend extends Beverage {

  public HouseBlend() {
    this.description = "House Blend Coffee";
  }

  public double cost() {
    return .89;
  }
}
