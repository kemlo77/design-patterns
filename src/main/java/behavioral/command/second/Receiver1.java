package behavioral.command.second;

public class Receiver1 implements Receiver {

  private int myNumber;

  public int getMyNumber() {
    return myNumber;
  }

  public void setMyNumber(int myNumber) {
    this.myNumber = myNumber;
  }

  public Receiver1() {
    myNumber = 10;
    System.out.println("Receiver initialized with " + this.myNumber);
    System.out.println("The objects of receiver 1 cannot set beyond " + this.myNumber);
  }

  @Override
  public void performDo() {
    System.out.println("Received an addition request.");
    System.out.print(this.myNumber + " + 2 = ");
    System.out.println(this.myNumber += 2);

  }

  @Override
  public void performUndo() {
    System.out.println("Received an undo addition request.");

    if (this.myNumber > 10) {
      System.out.print(this.myNumber + " - 2 = ");
      System.out.println(this.myNumber -= 2);
      System.out.println("\tUndoRequest processed");
    } else {
      System.out.println("Nothing more to undo...");
    }
  }
}
