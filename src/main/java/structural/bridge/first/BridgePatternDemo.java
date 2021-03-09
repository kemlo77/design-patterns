package structural.bridge.first;

public class BridgePatternDemo {
    public static void main(String[] args) {
        System.out.println("***Bridge Pattern Demo***");

        System.out.println("TV");
        State presentState = new OnState();
        ElectronicGoods eItem = new Television();
        eItem.setState(presentState);
        eItem.moveToCurrentState();
        eItem.hardButtonPressed();

        presentState = new OffState();
        eItem.setState(presentState);
        eItem.moveToCurrentState();

        System.out.println("DVD");
        presentState = new OnState();
        eItem = new DVD();
        eItem.setState(presentState);
        eItem.moveToCurrentState();

        presentState = new OffState();
        eItem = new DVD();
        eItem.setState(presentState);
        eItem.moveToCurrentState();
        ((DVD)eItem).doublePress();
    }
}
