package structural.flyweight;

public class LargeRobot implements Robot {

  private final String robotTypeCreated;

  public LargeRobot() {
    this.robotTypeCreated = "A large robot created";
    System.out.print(this.robotTypeCreated);
  }

  @Override
  public void showMe(String color) {
    System.out.println(" with " + color + " color");
  }
}
