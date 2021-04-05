package behavioral.observer.first;

public interface SubjectInterface {

  void register(Observer observer);
  void unregister(Observer observer);
  void notifyRegisteredUsers(int notifiedValue);

}
