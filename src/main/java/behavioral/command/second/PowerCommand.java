package behavioral.command.second;

public class PowerCommand implements Command {

  private Receiver receiver;

  public PowerCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void executeDo() {
    receiver.performDo();
  }

  @Override
  public void executeUndo() {
    receiver.performUndo();
  }
}
