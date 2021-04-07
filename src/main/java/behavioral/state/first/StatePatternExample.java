package behavioral.state.first;

public class StatePatternExample {
    public static void main(String[] args) {
        System.out.println("***State Pattern Demo\n***");

        TV tv = new TV();
        tv.pressOffButton();
        tv.pressOnButton();
        tv.pressOnButton();
        tv.pressMuteButton();
        tv.pressOnButton();
        tv.pressMuteButton();
        tv.pressOffButton();
    }
}
