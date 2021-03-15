package structural.decorator;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        System.out.println("***Decorator Pattern Demo\n");

        ConcreteComponent withoutDecor = new ConcreteComponent();
        withoutDecor.makeHouse();
        System.out.println("-------\n");

        System.out.println("Using a floor decorator now.");
        FloorDecorator floorDecorator = new FloorDecorator();
        floorDecorator.setComponent(withoutDecor);
        floorDecorator.makeHouse();
        System.out.println("-------\n");

        System.out.println("Using a paint decorator now.");
        PaintDecorator paintDecorator = new PaintDecorator();
        paintDecorator.setComponent(floorDecorator);
        paintDecorator.makeHouse();
    }
}
