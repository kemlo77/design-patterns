package structural.bridge.first;

public class OffState implements State {
    @Override
    public void moveState() {
        System.out.println("Off State\n");
    }

    @Override
    public void hardPressed() {
        System.out.println("\tThe device is offline now. Do not press the off button again.\n");
    }
}
