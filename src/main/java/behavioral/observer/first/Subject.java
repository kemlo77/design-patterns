package behavioral.observer.first;

import java.util.ArrayList;
import java.util.List;

public class Subject implements SubjectInterface {

  private int flag;
  List<Observer> observers = new ArrayList<>();

  public int getFlag() {
    return flag;
  }

  public void setFlag(int flag) {
    this.flag = flag;
    System.out.println("\nflag is set to: " + flag + " in Subject");
    notifyRegisteredUsers(this.flag);
  }

  @Override
  public void register(Observer observer) {
    this.observers.add(observer);
  }

  @Override
  public void unregister(Observer observer) {
    this.observers.remove(observer);
  }

  @Override
  public void notifyRegisteredUsers(int notifiedValue) {
    this.observers.forEach(c -> c.update(notifiedValue));
  }
}
