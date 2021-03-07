package creational.prototype;

import java.util.Random;

public class BasicCar implements Cloneable {

  public String modelName;
  public int basePrice;
  public int onRoadPrice;

  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public static int setAdditionalPrice() {
    int price;
    Random r = new Random();
    price = r.nextInt(100000);
    return price;
  }

  public BasicCar clone() throws CloneNotSupportedException {
    return (BasicCar) super.clone();
  }

}
