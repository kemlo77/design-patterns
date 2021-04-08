package behavioral.visitor.first;

public class VisitorPatternExample {

  public static void main(String[] args) {
    System.out.println("***Visitor Pattern Example***\n");

    Visitor visitor = new ConcreteVisitor();
    MyClass myClass = new MyClass();
    myClass.acceptVisitor(visitor);
  }

}
