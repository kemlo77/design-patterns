package structural.flyweight;

public class SmallRobot implements Robot {

  private final String robotTypeCreated;

  public SmallRobot() {
    this.robotTypeCreated = "A small robot created";
    System.out.print(this.robotTypeCreated);
  }

  @Override
  public void showMe(String color) {
    System.out.println(" with " + color + " color");
  }
}
