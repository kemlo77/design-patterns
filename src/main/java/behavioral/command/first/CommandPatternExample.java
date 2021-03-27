package behavioral.command.first;

public class CommandPatternExample {
    public static void main(String[] args) {
        System.out.println("***Command Pattern Demo***\n");

        Receiver intendedReceiver = new Receiver();
        MyUndoCommand undoCmd = new MyUndoCommand(intendedReceiver);
        MyRedoCommand redoCmd = new MyRedoCommand(intendedReceiver);

        Invoker invoker = new Invoker();

        invoker.setCommand(undoCmd);
        invoker.invokeCommand();

        invoker.setCommand(redoCmd);
        invoker.invokeCommand();

    }
}
