package behavioral.interpreter.first;

public class InterpreterPatternExample {
    public static void main(String[] args) {
        System.out.println("***INterpreter Pattern Demo***\n");

        //Minimum criteria for promotion is:
        //The years of experience is minimum 10 years. and
        //Employee grade should be either G2 or G3
        Context context = new Context(10, "G2", "G3");

        Employee employee1 = new IndividualEmployee(5, "G1");
        Employee employee2 = new IndividualEmployee(10, "G2");
        Employee employee3 = new IndividualEmployee(15, "G3");
        Employee employee4 = new IndividualEmployee(20, "G4");

        EmployeeBuilder employeeBuilder = new EmployeeBuilder();

        System.out.println("Employee 1 is eligible for promotion: " + employee1.interpret(context));
        System.out.println("Employee 2 is eligible for promotion: " + employee2.interpret(context));
        System.out.println("Employee 3 is eligible for promotion: " + employee3.interpret(context));
        System.out.println("Employee 4 is eligible for promotion: " + employee4.interpret(context));

        boolean employee1OrEmployee3 = employeeBuilder
                .buildExpression(employee1, "or", employee3)
                .interpret(context);
        boolean employee2AndEmployee4 = employeeBuilder
                .buildExpression(employee2,"and", employee4)
                .interpret(context);
        boolean notEmployee3 = employeeBuilder
                .buildExpression(employee3,"not", null)
                .interpret(context);
        System.out.println("Is either emp1 or emp3 eligible for promotion? " + employee1OrEmployee3);
        System.out.println("Is both employee2 and employee 4 eligible for promotion? " + employee2AndEmployee4);
        System.out.println("The statement 'employee3 is Not eligible for promotion' is true? " + notEmployee3);

    }
}
