package behavioral.mediator.second;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

  List<Employee> participants = new ArrayList<>();

  @Override
  public void register(Employee employee) {
    this.participants.add(employee);
  }

  public void displayRegisteredEmployees() {
    this.participants.stream().map(Employee::getName).forEach(System.out::println);
  }

  @Override
  public void sendMessage(Employee fromEmployee, Employee toEmployee, String msg)
      throws InterruptedException {
    if (fromEmployee.employeeType() == "UnauthorizedUser") {
      System.out.println("[ALERT Everyone] An outsider named " + fromEmployee +
          " is trying to send some messages to " + toEmployee + ".");
      fromEmployee.receive(fromEmployee, ", you are not allowed to enter here.");
    } else if (participants.contains(fromEmployee)) {
      System.out.println(
          "-----" + fromEmployee.getName() + " posts some message at: " + LocalDateTime.now()
              + "-----");
      Thread.sleep(1000);
      if (participants.contains(toEmployee)) {
        toEmployee.receive(fromEmployee, msg);
      } else {
        System.out.println(fromEmployee.getName() + " , your target recipient does not exist.");
      }
    } else {
      System.out.println("[ALERT] An unregistered employee named " + fromEmployee + " is trying to send some messages to " + toEmployee);
      System.out.println(fromEmployee + ", you need to register yourself first.");
    }

  }
}
