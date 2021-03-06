package creational.abstractfactory.second;

public class WildTiger implements Tiger {

    private String color;

    public WildTiger(String color) {
        System.out.println("A wild tiger with " + color + " is created");
        this.color = color;
    }

    @Override
    public void speak() {
        System.out.println("Wild Tiger says loudly: Halum.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild Tigers prefer hunting in jungles. \n");
    }
}
