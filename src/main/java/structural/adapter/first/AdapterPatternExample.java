package structural.adapter.first;

public class AdapterPatternExample {
    public static void main(String[] args) {
        CalculatorAdapter calculatorAdapter = new CalculatorAdapter();
        Triangle triangle = new Triangle(20,10);
        System.out.println("Area of Triangle is " + calculatorAdapter.getArea(triangle) + " square units");
    }
}
