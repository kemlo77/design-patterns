package behavioral.visitor.second;

public interface Visitor {
  void visitTheElement(CompositeEmployee employee);
  void visitTheElement(SimpleEmployee emloyee);

}
