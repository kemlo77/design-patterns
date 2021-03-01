package creational.builder.first;

public class Car implements Builder{

  private String brandName;
  private Product product;

  public Car(String brand) {
    this.product = new Product();
    this.brandName = brand;
  }


  @Override
  public void startUpOperations() {
    this.product.add(String.format("Car is :%s", this.brandName));
  }

  @Override
  public void buildBody() {
    this.product.add("This is a body of a Car");
  }

  @Override
  public void insertWheels() {
    this.product.add("4 wheels are added");
  }

  @Override
  public void addHeadlights() {
    this.product.add("2 headlights are added");
  }

  @Override
  public void endOperations() {
    //
  }

  @Override
  public Product getVehicle() {
    return this.product;
  }
}
