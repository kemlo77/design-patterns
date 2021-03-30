package behavioral.iterator.second;

public class ModifiedIteratorPatternExample2 {

    public static void main(String[] args) {
        System.out.println("*** Modified Iterator Pattern Demo***");

        Database employeeList = new EmployeeDatabase();

        EmployeeIterator iteratorForEmployee = employeeList.createIterator();

        System.out.println("Employee details are as follows: ");

        while (iteratorForEmployee.hasNext()) {
            System.out.println(iteratorForEmployee.next());
        }
    }
}
