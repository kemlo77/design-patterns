package creational.builder.first;

public class Motorcycle implements Builder {

  private String brandName;
  private Product product;

  public Motorcycle(String brand) {
    this.product = new Product();
    this.brandName = brand;
  }

  @Override
  public void startUpOperations() {
    //
  }

  @Override
  public void buildBody() {
    this.product.add("This is a body of a motorcycle");
  }

  @Override
  public void insertWheels() {
    this.product.add("2 wheels are added");
  }

  @Override
  public void addHeadlights() {
    this.product.add("1 headlight is added");
  }

  @Override
  public void endOperations() {
    this.product.add(String.format("Motorcycle model is :%S", this.brandName));
  }

  @Override
  public Product getVehicle() {
    return this.product;
  }
}
