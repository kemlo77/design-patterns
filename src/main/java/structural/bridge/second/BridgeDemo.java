package structural.bridge.second;

public class BridgeDemo {
    public static void main(String[] args) {
        Shape square = new Square(new BluePainter());
        System.out.println(square.draw());

        Shape circle = new Circle(new RedPainter());
        System.out.println(circle.draw());
    }
}
