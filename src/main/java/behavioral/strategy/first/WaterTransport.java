package behavioral.strategy.first;

public class WaterTransport implements TransportMedium {
    @Override
    public void transport() {
        System.out.println("I am transporting in water.");
    }
}
