package structural.decorator.first;

public class FloorDecorator extends AbstractDecorator {

    @Override
    public void makeHouse() {
        super.makeHouse();
        System.out.println("Floor decorator: I am making an additional floor on top of it");
    }


}
