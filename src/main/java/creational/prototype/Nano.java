package creational.prototype;

public class Nano extends BasicCar {

  public int basePrice = 100000;

  public Nano(String m) {
    this.modelName = m;
  }

  @Override
  public Nano clone() throws CloneNotSupportedException {
    return (Nano) super.clone();
  }
}
