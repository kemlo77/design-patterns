package structural.proxy.first;

public class Proxy extends Subject {
    static Subject cs;

    @Override
    public void doSomeWork() {
        System.out.println("Proxy call happening now ...");
        //Lazy initialization
        if (cs == null) {
            cs = new ConcreteSubject();
        }
        cs.doSomeWork();
    }
}
