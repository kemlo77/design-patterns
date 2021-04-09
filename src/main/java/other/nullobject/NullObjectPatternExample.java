package other.nullobject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NullObjectPatternExample {

  public static void main(String[] args) {
    System.out.println("***Null Object Pattern Demo***\n");

    List<String> choices = new ArrayList<>(Arrays.asList("bus", "train", "bus", "train", "limpa"));

    for (String vehicle : choices) {
      Vehicle gotVehicle = getVehicle(vehicle);
      gotVehicle.travel();
    }




  }

  private static Vehicle getVehicle(String desiredVehicle) {
    if (desiredVehicle.equalsIgnoreCase("bus")) {
      return new Bus();
    }
    if (desiredVehicle.equalsIgnoreCase("train")) {
      return new Train();
    }
    return NullVehicle.getInstance();
  }

}
