package other.nullobject;

public class Bus implements Vehicle {

  private static int busCount;

  public Bus() {
    busCount++;
  }

  public int getCount() {
    return busCount;
  }

  @Override
  public void travel() {
    System.out.println("Let's travel with a bus!");
  }
}
