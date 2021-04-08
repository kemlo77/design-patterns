package behavioral.visitor.second;

public interface Employee {
    void printStructures();
    void acceptVisitor(Visitor visitor);
}
