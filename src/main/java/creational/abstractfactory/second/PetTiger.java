package creational.abstractfactory.second;

public class PetTiger implements Tiger {

    private String color;

    public PetTiger(String color) {
        System.out.println("A pet tiger with " + color + " is created");
        this.color = color;
    }

    @Override
    public void speak() {
        System.out.println("Pet Tiger says softly: Halum.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet Tigers play in the animal circus.\n");
    }
}
