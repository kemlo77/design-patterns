package creational.abstractfactory.first;

public class WildDog implements Dog {
    @Override
    public void speak() {
        System.out.println("Wild Dog says loudly: Bow-Wow.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild dog sprefer to roam freely in jungles \n");
    }
}
