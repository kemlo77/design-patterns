package structural.proxy.third;

public class ConcreteSubject extends Subject {
    @Override
    public void doSomeWork() {
        System.out.println("doSomeWork() in ConcreteSubject is invoked.");
    }
}
