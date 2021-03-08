package creational.simplefactory;

public class SimpleFactory {

    public Animal createAnimal(String animalNumber) {
        Animal intendedAnimal = null;

        switch (animalNumber) {
            case "dog":
                intendedAnimal = new Dog();
                break;
            case "tiger":
                intendedAnimal = new Tiger();
                break;
            default:
                System.out.println("Enter either 'dog' or 'tiger'.");
                throw new IllegalArgumentException("Your choice tries to create an unknown Animal");
        }

        return intendedAnimal;

    }
}
