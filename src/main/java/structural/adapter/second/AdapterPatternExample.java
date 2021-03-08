package structural.adapter.second;

import java.util.ArrayList;
import java.util.List;

public class AdapterPatternExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 10);
        System.out.println("Rectangle area is: " + rectangle.calculateAreaOfRectangle());

        Triangle triangle = new Triangle(10, 5);
        System.out.println("Triangle area is: " + triangle.calculateAreaOfTriangle());

        RectInterface adapter = new TriangleAdapter(triangle);
        System.out.println("Area of triangle using triangle-adapter is: " + getArea(adapter));

        List<RectInterface> rectangleObjects = new ArrayList<>();
        rectangleObjects.add(rectangle);
        rectangleObjects.add(adapter);

        System.out.println("Info about objects:");
        rectangleObjects.forEach(RectInterface::aboutRectangle);
    }

    static double getArea(RectInterface r) {
        return r.calculateAreaOfRectangle();
    }
}
