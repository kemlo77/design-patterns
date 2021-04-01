package behavioral.mediator.first;

public class MediatorPatternExample {
    public static void main(String[] args) throws InterruptedException {
        Mediator mediator = new ConcreteMediator();

        Employee arne = new JuniorEmployee(mediator, "Arne");
        Employee bertil = new JuniorEmployee(mediator, "Bertil");
        Employee cesar = new SeniorEmployee(mediator, "Cesar");
        Employee unknown = new Unknown(mediator, "Jack");

        mediator.register(arne);
        mediator.register(bertil);
        mediator.register(cesar);

        //mediator.displayRegisteredEmployees();

        System.out.println("Communication starts among participants...");
        arne.sendMessage("Hur är läget");
        bertil.sendMessage("Det är bra");
        cesar.sendMessage("Tillbaka till jobbet.");
        unknown.sendMessage("Wazzup");

    }
}
