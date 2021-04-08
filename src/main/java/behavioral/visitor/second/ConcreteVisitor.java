package behavioral.visitor.second;

public class ConcreteVisitor implements Visitor {

  @Override
  public void visitTheElement(CompositeEmployee employee) {
    boolean eligibleForPromotion = employee.getYearsOfExperience() > 15;
    System.out.println("\t\t" + employee.getName() + " from " + employee.getDept()
        + " is eligibile for promotion? " + eligibleForPromotion);
  }

  @Override
  public void visitTheElement(SimpleEmployee employee) {
    boolean eligibleForPromotion = employee.getYearsOfExperience() > 12;
    System.out.println("\t\t" + employee.getName() + " from " + employee.getDept()
        + " is eligibile for promotion? " + eligibleForPromotion);
  }
}
