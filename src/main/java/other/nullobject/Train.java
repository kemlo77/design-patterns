package other.nullobject;

public class Train implements Vehicle {

  private static int trainCount;

  public Train() {
    trainCount++;
  }

  public int getCount() {
    return trainCount;
  }

  @Override
  public void travel() {
    System.out.println("Let's travel by train!");
  }
}
