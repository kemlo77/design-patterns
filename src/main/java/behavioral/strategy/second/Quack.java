package behavioral.strategy.second;

public class Quack implements QuackBehaviour {

  @Override
  public void quack() {
    System.out.println("Quack");
  }
}
