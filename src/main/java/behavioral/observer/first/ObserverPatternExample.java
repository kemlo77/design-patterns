package behavioral.observer.first;

public class ObserverPatternExample {

  public static void main(String[] args) {
    System.out.println("***Observer Pattern Demo***");

    Observer myObserver1 = new ObserverType1("Arne");
    Observer myObserver2 = new ObserverType1("Boris");
    Observer myObserver3 = new ObserverType2("Charlie");

    Subject subject = new Subject();

    subject.register(myObserver1);
    subject.register(myObserver2);
    subject.register(myObserver3);

    subject.setFlag(5);

    subject.unregister(myObserver1);
    subject.setFlag(50);

    subject.register(myObserver1);
    subject.setFlag(100);
  }

}
