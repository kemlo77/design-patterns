package other.mvc.first.view;

import java.util.List;
import other.mvc.first.model.Employee;

public class ConsoleView implements View {

  @Override
  public void showEnrolledEmployees(List<Employee> enrolledEmployees) {
    System.out.println("This is a console view of currently enrolled employees");
    enrolledEmployees.forEach(System.out::println);
  }
}
