package behavioral.command.second;

public class AdditionCommand implements Command {

  private Receiver receiver;

  public AdditionCommand(Receiver receiver) {
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
