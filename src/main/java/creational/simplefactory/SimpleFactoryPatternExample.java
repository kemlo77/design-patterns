package creational.simplefactory;

public class SimpleFactoryPatternExample {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();

        Animal firstAnimal = simpleFactory.createAnimal("dog");
        firstAnimal.speak();
        firstAnimal.preferredAction();

        Animal secondAnimal = simpleFactory.createAnimal("dog");
        secondAnimal.speak();
        secondAnimal.preferredAction();
    }

}
