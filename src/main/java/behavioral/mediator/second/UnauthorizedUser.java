package behavioral.mediator.second;

public class UnauthorizedUser extends Employee {

  public UnauthorizedUser(Mediator mediator, String name) {
    super(mediator, name, false);
  }

  @Override
  public String employeeType() {
    return "UnauthorizedUser";
  }

  @Override
  public void receive(Employee fromEmployee, String message) {
    System.out.println(this.name + message);
  }
}
