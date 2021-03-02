package creational.builder.second;

public class BuilderPatternModifiedExample {

  public static void main(String[] args) {
    System.out.println("**Modified Builder Pattern Demo***");

    final ProductClass customCar1 = new CarBuilder()
        .addHeadLights(5)
        .insertWheels(5)
        .buildBody("Plastic")
        .endOperations("Arne är klar")
        .constructCar();
    System.out.println(customCar1);
    System.out.println("------------------");

    ModifiedBuilder carBuilder2 = new CarBuilder();
    final ProductClass customCar2 = carBuilder2
        .insertWheels(7)
        .addHeadLights(6)
        .startUpOperations("I am making my own car")
        .constructCar();
    System.out.println(customCar2);


    final ProductClass customCar3 = carBuilder2.getConstructedCar();
    System.out.println(customCar3);
  }

}
