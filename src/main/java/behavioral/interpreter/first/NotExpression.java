package behavioral.interpreter.first;

public class NotExpression implements Employee {
    private Employee employee;

    public NotExpression(Employee employee1) {
        this.employee = employee1;
    }

    @Override
    public boolean interpret(Context context) {
        return !employee.interpret(context);
    }
}
