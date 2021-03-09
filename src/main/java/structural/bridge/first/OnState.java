package structural.bridge.first;

public class OnState implements State {
    @Override
    public void moveState() {
        System.out.println("On State\n");
    }

    @Override
    public void hardPressed() {
        System.out.println("\tThe device is already On. Do not presse the button so hard.\n");
    }
}
