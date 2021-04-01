package behavioral.mediator.second;

public interface Mediator {

  void register(Employee employee);
  void sendMessage(Employee fromEmployee, Employee toEmployee, String msg) throws InterruptedException;

}
