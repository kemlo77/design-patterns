package other.mvc.first.view;

import java.util.List;
import other.mvc.first.model.Employee;

public interface View {

  void showEnrolledEmployees(List<Employee> enrolledEmployees);

}
