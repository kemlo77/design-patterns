package structural.proxy.second;

public class Proxy extends Subject {

    static Subject cs;
    static int count = 0;

    public Proxy() {
        cs = new ConcreteSubject();
        count++;
    }

    @Override
    public void doSomeWork() {
        System.out.println("Proxy call happening now ...");
        cs.doSomeWork();

    }
}
