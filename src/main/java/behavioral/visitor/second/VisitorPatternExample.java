package behavioral.visitor.second;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VisitorPatternExample {

    public static void main(String[] args) {
        SimpleEmployee mathTeacher1 = new SimpleEmployee("Staffan", "Maths", 13);
        SimpleEmployee mathTeacher2 = new SimpleEmployee("Jon", "Maths", 6);

        SimpleEmployee programmingTeacher1 = new SimpleEmployee("Per", "Computer Sc.", 10);
        SimpleEmployee programmingTeacher2 = new SimpleEmployee("Bob", "Computer Sc.", 13);
        SimpleEmployee programmingTeacher3 = new SimpleEmployee("Harold", "Computer Sc.", 7);

        CompositeEmployee headOfMaths = new CompositeEmployee("Thomas", "Maths", 14);
        CompositeEmployee headOfProgramming = new CompositeEmployee("Geoff", "Computer Sc", 16);

        CompositeEmployee principal = new CompositeEmployee("Ive", "Management", 20);

        headOfMaths.addEmployee(mathTeacher1);
        headOfMaths.addEmployee(mathTeacher2);

        headOfProgramming.addEmployee(programmingTeacher1);
        headOfProgramming.addEmployee(programmingTeacher2);
        headOfProgramming.addEmployee(programmingTeacher3);

        principal.addEmployee(headOfMaths);
        principal.addEmployee(headOfProgramming);

        principal.printStructures();
        System.out.println("");

        Visitor visitor = new ConcreteVisitor();

        List<Employee> allEmployees = Stream
            .of(principal.getControls(), headOfMaths.getControls(), headOfProgramming.getControls())
            .flatMap(c->c.stream())
            .collect(Collectors.toList());
        allEmployees.forEach(e -> e.acceptVisitor(visitor));


    }

}
