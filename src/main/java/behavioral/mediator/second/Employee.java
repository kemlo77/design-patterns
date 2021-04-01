package behavioral.mediator.second;

abstract class Employee {

  private Mediator mediator;
  protected String name;
  private boolean authorizedUser;

  public Employee(Mediator mediator, String name, boolean authorizedUser) {
    this.mediator = mediator;
    this.name = name;
    this.authorizedUser = authorizedUser;
    if(authorizedUser){
      mediator.register(this);
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void send(Employee toFriend, String msg ) throws InterruptedException {
    mediator.sendMessage(this,toFriend, msg);
  }

  public void receive(Employee fromFriend, String message) {
    System.out.println(this + " received a message: \"" + message + "\" from the employee " + fromFriend + ".");
  }

  public abstract String employeeType();

  @Override
  public String toString() {
    return this.name;
  }
}
