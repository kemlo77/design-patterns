package behavioral.strategy.second;

public abstract class Duck {

  FlyBehaviour flyBehaviour;
  QuackBehaviour quackBehaviour;

  public Duck() {}

  public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
    this.flyBehaviour = flyBehaviour;
  }

  public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
    this.quackBehaviour = quackBehaviour;
  }

  public abstract void display();

  public void performFly() {
    this.flyBehaviour.fly();
  }

  public void performQuack() {
    this.quackBehaviour.quack();
  }

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }

}
