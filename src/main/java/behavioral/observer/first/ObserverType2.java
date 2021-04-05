package behavioral.observer.first;

public class ObserverType2 implements Observer {

  private String nameOfObserver;

  public ObserverType2(String nameOfObserver) {
    this.nameOfObserver = nameOfObserver;
  }

  @Override
  public void update(int updatedValue) {
    System.out.println(this.nameOfObserver
        + " has received an alert: Updated myValue in Subject is: "
        + updatedValue);
  }
}
