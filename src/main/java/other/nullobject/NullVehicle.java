package other.nullobject;

public class NullVehicle implements Vehicle {

  private static NullVehicle instance = new NullVehicle();
  private static int nullVehicleCount;

  private NullVehicle() {
    nullVehicleCount++;
  }

  public static NullVehicle getInstance() {
    return instance;
  }

  public int getCount() {
    return nullVehicleCount;
  }

  @Override
  public void travel() {
    //
  }
}
