package creational.builder.second;

public class ProductClass {

  private String startUpMessage;
  private String bodyType;
  private int noOfWheels;
  private int noOfHeadLights;
  private String endOperationsMessage;

  public ProductClass(String startUpMessage, String bodyType, int noOfWheels, int noOfHeadLights,
      String endOperationsMessage) {
    this.startUpMessage = startUpMessage;
    this.bodyType = bodyType;
    this.noOfWheels = noOfWheels;
    this.noOfHeadLights = noOfHeadLights;
    this.endOperationsMessage = endOperationsMessage;
  }

  @Override
  public String toString() {
    return "ProductClass{" +
        "startUpMessage='" + startUpMessage + '\'' +
        ", bodyType='" + bodyType + '\'' +
        ", noOfWheels=" + noOfWheels +
        ", noOfHeadLights=" + noOfHeadLights +
        ", endOperationsMessage='" + endOperationsMessage + '\'' +
        '}';
  }
}
