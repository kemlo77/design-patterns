package behavioral.state.first;

class OffState implements PossibleState{
    @Override
    public void pressOnButton(TV context) {
        context.setCurrentState(new OnState());
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
