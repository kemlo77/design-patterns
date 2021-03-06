package creational.abstractfactory.first;

public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        AnimalFactory myAnimalFactory;
        Dog myDog;
        Tiger myTiger;

        System.out.println("***Abstract Factory Pattern Demo***\n");
        myAnimalFactory = new WildAnimalFactory();

        myDog = myAnimalFactory.createDog();
        myDog.speak();
        myDog.preferredAction();

        myTiger = myAnimalFactory.createTiger();
        myTiger.speak();
        myTiger.preferredAction();

        System.out.println("*************************");

        myAnimalFactory = new PetAnimalFactory();

        myDog = myAnimalFactory.createDog();
        myDog.speak();
        myDog.preferredAction();

        myTiger = myAnimalFactory.createTiger();
        myTiger.speak();
        myTiger.preferredAction();

    }
}
