package structural.facade;

public class RobotFacade {

  RobotColor robotColor;
  RobotHands robotHands;
  RobotBody robotBody;

  public RobotFacade() {
    this.robotColor = new RobotColor();
    this.robotHands = new RobotHands();
    this.robotBody = new RobotBody();
  }

  public void constructMilanoRobot() {
    RobotBody.createRobot();
    robotColor.setDefaultColor();
    robotHands.setMilanoHands();
    robotBody.createHands();
    robotBody.createRemainingParts();
    System.out.println("");
  }

  public void destroyMilanoRobot() {
    RobotBody.destroyRobot();
    robotHands.resetMilanoHands();
    robotBody.destroyHands();
    robotBody.destroyRemainingParts();
  }
}
