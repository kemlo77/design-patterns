package behavioral.command.second;

public class ModifiedCommandPatternExample {

  public static void main(String[] args) {
    System.out.println("Testing operations in receiver1");
    Receiver intendedReceiver = new Receiver1();
    Command currentCmd = new AdditionCommand(intendedReceiver);
    Invoker invoker = new Invoker();
    invoker.setCommand(currentCmd);

    System.out.println("Testing single do/undo operation");
    invoker.executeCommand();
    invoker.undoCommand();
    System.out.println("Testing a series of do/undo operations");
    invoker.executeCommand();
    invoker.executeCommand();
    invoker.undoCommand();
    invoker.undoCommand();
    invoker.undoCommand();

    System.out.println("Testing operations in receiver2");
    intendedReceiver = new Receiver2();
    currentCmd = new PowerCommand(intendedReceiver);
    invoker.setCommand(currentCmd);

    System.out.println("Testing single do/undo operation");
    invoker.executeCommand();
    invoker.undoCommand();
    System.out.println("Testing a series of do/undo operations");
    invoker.executeCommand();
    invoker.executeCommand();
    invoker.undoCommand();
    invoker.undoCommand();
    invoker.undoCommand();
  }

}
