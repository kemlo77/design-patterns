package other.mvc.first.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeModel implements Model {

  List<Employee> enrolledEmployees;

  public EmployeeModel() {
    this.enrolledEmployees = new ArrayList<>();
    this.enrolledEmployees.add(new Employee("David", 4));
    this.enrolledEmployees.add(new Employee("Eric", 5));
    this.enrolledEmployees.add(new Employee("Frances", 6));
  }

  @Override
  public List<Employee> getEnrolledDetailsFromModell() {
    return this.enrolledEmployees;
  }

  @Override
  public void addEmployeeToModel(Employee employee) {
    System.out.println("Trying to add an employee to the registred list");
    if (this.enrolledEmployees.contains(employee)) {
      System.out.println("\t" + employee + " is already added in the system.");
    } else {
      this.enrolledEmployees.add(employee);
      System.out.println("\t" + employee + "added in the system.");
    }
  }

  @Override
  public void removeEmployeeFromModel(int employeeId) {
    System.out.println("Trying to remove employee with id: " + employeeId);
    boolean isRemoved = this.enrolledEmployees.removeIf(e -> e.getId() == employeeId);

    if (isRemoved) {
      System.out.println("\tEmployee number " + employeeId + " is removed");
    } else {
      System.out.println("\tEmployee number " + employeeId + " did not exist in system.");
    }
  }
}
