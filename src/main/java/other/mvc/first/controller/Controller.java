package other.mvc.first.controller;

import other.mvc.first.model.Employee;

public interface Controller {

  void displayEnrolledEmployees();
  void addEmployee(Employee employee);
  void removeEmployee(int employeeId);

}
