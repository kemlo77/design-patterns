package creational.builder.second;

public interface ModifiedBuilder {

  ModifiedBuilder startUpOperations(String startUpMessage);
  ModifiedBuilder buildBody(String bodyType);
  ModifiedBuilder insertWheels(int noOfWheels);
  ModifiedBuilder addHeadLights(int noOfHeadLights);
  ModifiedBuilder endOperations(String endOperationsMessage);
  ProductClass constructCar();
  ProductClass getConstructedCar();

}
