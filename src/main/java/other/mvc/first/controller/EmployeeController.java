package other.mvc.first.controller;

import java.util.List;
import other.mvc.first.model.Employee;
import other.mvc.first.model.Model;
import other.mvc.first.view.View;

public class EmployeeController implements Controller {

  private Model model;
  private View view;

  public EmployeeController(Model model, View view) {
    this.model = model;
    this.view = view;
  }



  @Override
  public void displayEnrolledEmployees() {
    List<Employee> enrolledEmployees = model.getEnrolledDetailsFromModell();
    view.showEnrolledEmployees(enrolledEmployees);
  }

  @Override
  public void addEmployee(Employee employee) {
    model.addEmployeeToModel(employee);
  }

  @Override
  public void removeEmployee(int employeeId) {
    model.removeEmployeeFromModel(employeeId);
  }
}
