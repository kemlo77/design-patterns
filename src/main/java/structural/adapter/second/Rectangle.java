package structural.adapter.second;

public class Rectangle implements RectInterface {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void aboutRectangle() {
        System.out.println("Rectangle, width = " + this.width + " and length = " + this.length);
    }

    @Override
    public double calculateAreaOfRectangle() {
        return this.length * this.width;
    }
}
