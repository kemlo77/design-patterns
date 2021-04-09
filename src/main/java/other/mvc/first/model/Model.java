package other.mvc.first.model;

import java.util.List;

public interface Model {

  List<Employee> getEnrolledDetailsFromModell();
  void addEmployeeToModel(Employee employee);
  void removeEmployeeFromModel(int employeeId);

}
