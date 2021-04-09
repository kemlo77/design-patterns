package other.mvc.first.demo;

import other.mvc.first.controller.Controller;
import other.mvc.first.controller.EmployeeController;
import other.mvc.first.model.Employee;
import other.mvc.first.model.EmployeeModel;
import other.mvc.first.model.Model;
import other.mvc.first.view.ConsoleView;
import other.mvc.first.view.View;

public class MVCArhitectureExample {

  public static void main(String[] args) {

    System.out.println("***MVC arhitecture Demo");

    Model model = new EmployeeModel();
    View view = new ConsoleView();
    Controller controller = new EmployeeController(model, view);

    controller.displayEnrolledEmployees();

    Employee employee1 = new Employee("Arne", 1);
    Employee employee2 = new Employee("Berit", 2);
    Employee employee3 = new Employee("Charlie", 3);

    controller.addEmployee(employee1);
    controller.addEmployee(employee2);
    controller.addEmployee(employee3);
    controller.addEmployee(employee3);

    controller.removeEmployee(1);
    controller.removeEmployee(1);


  }

}
