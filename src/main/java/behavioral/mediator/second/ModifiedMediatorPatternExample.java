package behavioral.mediator.second;

public class ModifiedMediatorPatternExample {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("***Mediator Pattern Demo***\n");

    ConcreteMediator mediator = new ConcreteMediator();

    Employee arne = new ConcreteEmployee(mediator, "Arne", true);
    Employee bertil = new ConcreteEmployee(mediator, "Bertil", true);
    Employee camilla = new ConcreteEmployee(mediator, "Camilla", true);

    Employee jack = new ConcreteEmployee(mediator,"Jack", false);

    Employee daniella = new UnauthorizedUser(mediator,"Daniella");

    mediator.displayRegisteredEmployees();

    System.out.println("Communication starts among participants ...");

    arne.send(bertil, "Hi, can we discuss the mediator pattern?");
    bertil.send(arne, "Yes, of course.");
    camilla.send(arne, "Please get back to work quickly.");
    camilla.send(bertil, "Please get back to work quickly.");

    jack.send(arne, "Hello, gorgeous!");
    daniella.send(bertil,"You are eligible to inherit this vast fortune.");
  }

}
