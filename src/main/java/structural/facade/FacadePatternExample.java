package structural.facade;

public class FacadePatternExample {

  public static void main(String[] args) {
    RobotFacade milanoRobotFacade = new RobotFacade();
    milanoRobotFacade.constructMilanoRobot();
    milanoRobotFacade.destroyMilanoRobot();
  }

}
