package structural.flyweight;

public class FixSizedRobot implements Robot {

  private final String robotTypeCreated;

  public FixSizedRobot() {

    this.robotTypeCreated = "A robot with a fixed size created.";
    System.out.print(this.robotTypeCreated);
  }

  @Override
  public void showMe(String color) {
    System.out.println(" with " + " blue (default) color");
  }
}
