package behavioral.strategy.first;

public class Boat extends Vehicle {

    public Boat() {
        this.transportMedium = new WaterTransport();
    }

    @Override
    public void showMe() {
        System.out.println("I am a boat.");
    }
}
