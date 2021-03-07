package creational.prototype;

public class Ford extends BasicCar {

  public int basePrice = 100000;

  public Ford(String m) {
    this.modelName = m;
  }

  @Override
  public Ford clone() throws CloneNotSupportedException {
    return (Ford) super.clone();
  }
}
