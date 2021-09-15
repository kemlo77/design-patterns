package behavioral.strategy.second;

public class MallardDuck extends Duck{

  public MallardDuck() {
    this.quackBehaviour = new Quack();
    this.flyBehaviour = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("I'm a real Mallard duck");
  }

}
