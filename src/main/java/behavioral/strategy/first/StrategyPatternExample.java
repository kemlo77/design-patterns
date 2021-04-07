package behavioral.strategy.first;

public class StrategyPatternExample {
    public static void main(String[] args) {
        System.out.println("***Strategy Pattern Demo\n");

        Vehicle boatContext = new Boat();
        boatContext.showMe();
        boatContext.showTransportMedium();
        boatContext.commonJob();
        System.out.println("");

        Vehicle airplaneContext = new Airplane();
        airplaneContext.showMe();
        airplaneContext.showTransportMedium();
        airplaneContext.commonJob();


    }
}
