package behavioral.state.first;

class OffState implements PossibleState{

    TV context;

    public OffState(TV context) {
        this.context = context;
    }

    @Override
    public void pressOnButton(TV context) {
        this.context.setCurrentState(new OnState(this.context));
    }

    @Override
    public void pressOffButton(TV context) {
        //
    }

    @Override
    public void pressMuteButton(TV context) {
        //
    }
}
