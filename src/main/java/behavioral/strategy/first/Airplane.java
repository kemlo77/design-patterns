package behavioral.strategy.first;

public class Airplane extends Vehicle {

    public Airplane() {
        this.transportMedium = new AirTransport();
    }

    @Override
    public void showMe() {
        System.out.println("I am an airplane.");
    }
}
