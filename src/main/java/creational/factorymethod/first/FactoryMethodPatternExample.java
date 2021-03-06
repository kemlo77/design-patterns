package creational.factorymethod.first;

public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        System.out.println("***Factory Pattern Demo***");

        AnimalFactory tigerFactory = new TigerFactory();
        Animal tiger = tigerFactory.createAnimal();
        tiger.speak();
        tiger.preferredAction();


        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.speak();
        dog.preferredAction();
    }
}
