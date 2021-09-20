package structural.decorator.first;

public class AbstractDecorator extends Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void makeHouse() {
        if (component != null) {
            component.makeHouse();
        }
    }
}
