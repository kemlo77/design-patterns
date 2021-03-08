package structural.adapter.second;

public class Triangle implements TriInterface {
    public double base;
    public double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void aboutTriangle() {
        System.out.println("Triangle, base = " + this.base + " and height = " + this.height);
    }

    @Override
    public double calculateAreaOfTriangle() {
        return this.base * this.height * 0.5;
    }
}
