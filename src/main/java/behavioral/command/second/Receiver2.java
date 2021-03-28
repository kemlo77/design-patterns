package behavioral.command.second;

public class Receiver2 implements Receiver {
  private boolean statusIsOn;

  public Receiver2() {
    System.out.println("Receiver2 initialized");
    this.statusIsOn = false;
  }

  @Override
  public void performDo() {
    System.out.println("Received a system power on request.");
    if (this.statusIsOn) {
      System.out.println("System is already running. So, power on request is ignored.");
    } else {
      System.out.println("System is starting up");
      this.statusIsOn = true;
    }
  }

  @Override
  public void performUndo() {
    System.out.println("Received an undo request");
    if (this.statusIsOn) {
      System.out.println("System is currently powered on.");
      this.statusIsOn = false;
      System.out.println("\tUndo request processed. System is switched off now.");
    } else {
      System.out.println("System is switchec off at present.");
      this.statusIsOn = true;
      System.out.println("\t Undo request processed. System is powered on now");
    }
  }
}
