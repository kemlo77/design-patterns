package behavioral.command.first;

public class Invoker {
    Command commandToBePerformed;
    public void setCommand(Command command) {
        this.commandToBePerformed = command;
    }

    public void invokeCommand() {
        commandToBePerformed.executeCommand();
    }
}
