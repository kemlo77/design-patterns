package behavioral.state.first;

class OnState implements PossibleState {

    TV context;

    public OnState(TV context) {
        this.context = context;
    }

    @Override
    public void pressOnButton(TV context) {
        //
    }

    @Override
    public void pressOffButton(TV context) {
        this.context.setCurrentState(new OffState(this.context));
    }

    @Override
    public void pressMuteButton(TV context) {
        context.setCurrentState(new MuteState(this.context));
    }
}
