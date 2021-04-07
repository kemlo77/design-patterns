package behavioral.state.first;

class OnState implements PossibleState {

    @Override
    public void pressOnButton(TV context) {
        //
    }

    @Override
    public void pressOffButton(TV context) {
        context.setCurrentState(new OffState());
    }

    @Override
    public void pressMuteButton(TV context) {
        context.setCurrentState(new MuteState());
    }
}
