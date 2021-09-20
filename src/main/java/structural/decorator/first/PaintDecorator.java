package structural.decorator.first;

public class PaintDecorator extends AbstractDecorator {

    @Override
    public void makeHouse() {
        super.makeHouse();
        System.out.println("PaintDecorator: Now I am painting the house");
    }


}
