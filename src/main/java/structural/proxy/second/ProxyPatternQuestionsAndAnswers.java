package structural.proxy.second;

public class ProxyPatternQuestionsAndAnswers {
    public static void main(String[] args) {
        System.out.println("***Proxy Pattern Demo without lazy instantiation***");
        Proxy px = new Proxy();
        px.doSomeWork();

        Proxy px2 = new Proxy();
        px2.doSomeWork();

        System.out.println("Instance count: " + Proxy.count);
    }
}
