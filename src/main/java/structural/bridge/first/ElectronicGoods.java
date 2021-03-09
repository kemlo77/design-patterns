package structural.bridge.first;

abstract class ElectronicGoods {
    protected State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void moveToCurrentState() {
        System.out.println("The electronic item is functioning at: ");
        state.moveState();
    }

    public void hardButtonPressed() {
        state.hardPressed();
    }
}
