package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

  static Map<String, Robot> robotFactory = new HashMap<>();

  public int totalObjectsCreated() {
    return robotFactory.size();
  }

  public static synchronized Robot getRobotFromFactory(String robotType) throws Exception {
    Robot robotCategory = robotFactory.get(robotType);
    if (robotCategory == null) {
      switch (robotType) {
        case "small":
          System.out.println("We do not have Small Robot. So we are creating one");
          robotCategory = new SmallRobot();
          break;
        case "large":
          System.out.println("We do not have Large Robot. So we are creating one");
          robotCategory = new LargeRobot();
          break;
        case "fixed":
          System.out.println("We do not have Fixed Size Robot. So we are creating one");
          robotCategory = new FixSizedRobot();
          break;
        default:
          throw new Exception("Robot Factory can only create small, large and fixed size robot");
      }
      robotFactory.put(robotType, robotCategory);
    } else {
      System.out.print("Using existing " + robotType + "robot and coloring it");
    }
    return robotCategory;
  }

}
