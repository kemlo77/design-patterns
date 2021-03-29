package behavioral.interpreter.first;

public class EmployeeBuilder {

    public Employee buildExpression(Employee employee1, String operator, Employee employee2) {
        switch (operator.toLowerCase()) {
            case "or":
                return new OrExpression(employee1, employee2);
            case "and":
                return new AndExpression(employee1, employee2);
            case "not":
                return new NotExpression(employee1);
            default:
                System.out.println("Only AND, OR and NOT operators are allowed at present");
                return null;
        }
    }

}
