package structural.proxy.third;

public class ModifiedProxyPatternExample {
    public static void main(String[] args) {
        System.out.println("***Modified Proxy Pattern Demo***");
        Subject px = new ModifiedProxy("Admin");
        px.doSomeWork();

        Subject px2 = new ModifiedProxy("Arne");
        px2.doSomeWork();
    }

}
