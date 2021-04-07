package behavioral.state.first;

public class TV {
    private PossibleState currentState;

    public TV() {
        this.currentState = new OffState();
    }

    public PossibleState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PossibleState newState) {
        System.out.println("\tState is changed to: " + newState.getClass().getSimpleName());
        this.currentState = newState;
    }

    public void pressOnButton() {
        System.out.println("You pressed On button");
        this.currentState.pressOnButton(this);
    }

    public void pressOffButton() {
        System.out.println("You pressed Off button");
        this.currentState.pressOffButton(this);
    }

    public void pressMuteButton() {
        System.out.println("You pressed Mute button");
        this.currentState.pressMuteButton(this);
    }
}
