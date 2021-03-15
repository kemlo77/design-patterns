package structural.composite;

public class CompositePatternExample {

    public static void main(String[] args) {
        Employee mathTeacher1 = new Employee("Staffan", "Maths");
        Employee mathTeacher2 = new Employee("Jon", "Maths");

        Employee programmingTeacher1 = new Employee("Per", "Computer Sc.");
        Employee programmingTeacher2 = new Employee("Bob", "Computer Sc.");
        Employee programmingTeacher3 = new Employee("Harold", "Computer Sc.");

        CompositeEmployee headOfMaths = new CompositeEmployee("Thomas", "Maths");
        CompositeEmployee headOfProgramming = new CompositeEmployee("Geoff", "Computer Sc");

        CompositeEmployee principal = new CompositeEmployee("Ive", "Management");

        headOfMaths.addEmployee(mathTeacher1);
        headOfMaths.addEmployee(mathTeacher2);

        headOfProgramming.addEmployee(programmingTeacher1);
        headOfProgramming.addEmployee(programmingTeacher2);
        headOfProgramming.addEmployee(programmingTeacher3);

        principal.addEmployee(headOfMaths);
        principal.addEmployee(headOfProgramming);

        principal.printStructures();
        System.out.println("antal anställda: " + principal.getEmployeeCount());
        System.out.println("");

        headOfMaths.printStructures();
        System.out.println("antal anställda: " + headOfMaths.getEmployeeCount());
        System.out.println("");

        headOfProgramming.printStructures();
        System.out.println("antal anställda: " + headOfProgramming.getEmployeeCount());
        System.out.println("");

        mathTeacher1.printStructures();
        System.out.println("antal anställda: " + mathTeacher1.getEmployeeCount());


    }

}
