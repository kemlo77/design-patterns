package behavioral.strategy.second;

public class MuteQuack implements QuackBehaviour {

  @Override
  public void quack() {
    System.out.println("<< Silence >>");
  }
}
