package behavioral.command.first;

public class MyUndoCommand implements Command {

    private Receiver receiver;

    public MyUndoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void executeCommand() {
        receiver.doOptionalTaskPriorToUndo();
        receiver.performUndo();

    }
}
