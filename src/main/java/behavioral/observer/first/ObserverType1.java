package behavioral.observer.first;

public class ObserverType1 implements Observer {

  private String nameOfObserver;

  public ObserverType1(String nameOfObserver) {
    this.nameOfObserver = nameOfObserver;
  }

  @Override
  public void update(int updatedValue) {
    System.out.println(this.nameOfObserver
        + " has received an alert: Updated myValue in Subject is: "
        + updatedValue);
  }
}
