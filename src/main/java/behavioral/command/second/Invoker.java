package behavioral.command.second;

public class Invoker {

  Command commandToBePerformed;

  public void setCommand(Command command) {
    this.commandToBePerformed = command;
  }

  public void executeCommand() {
    this.commandToBePerformed.executeDo();
  }

  public void undoCommand() {
    this.commandToBePerformed.executeUndo();
  }
}
