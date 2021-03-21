package structural.flyweight;

import java.util.Random;

public class FlyweightPatternExample {

  public static void main(String[] args) throws Exception {

    RobotFactory robotFactory = new RobotFactory();

    Robot myRobot;

    for (int i = 0; i < 3; i++) {
      myRobot = RobotFactory.getRobotFromFactory("small");
      Thread.sleep(200);
      myRobot.showMe(getRandomColor());
    }

    printNumberOfDistinctObjectsCreated(robotFactory);

    for (int j = 0; j < 5; j++) {
      myRobot = RobotFactory.getRobotFromFactory("large");
      Thread.sleep(200);
      myRobot.showMe(getRandomColor());
    }

    printNumberOfDistinctObjectsCreated(robotFactory);

    for (int k = 0; k < 4; k++) {
      myRobot = RobotFactory.getRobotFromFactory("fixed");
      Thread.sleep(200);
      myRobot.showMe(getRandomColor());
    }

    printNumberOfDistinctObjectsCreated(robotFactory);


  }

  private static void printNumberOfDistinctObjectsCreated(RobotFactory robotFactory) {
    int numOfDistinctRobots = robotFactory.totalObjectsCreated();
    System.out.println("Till now, total no of distinct robot objects created: " + numOfDistinctRobots + "\n");
  }

  static String getRandomColor() {
    Random r = new Random();
    int random = r.nextInt();
    if (random % 2 == 0) {
      return "red";
    } else {
      return "green";
    }
  }

}
