package structural.proxy.third;

import java.util.ArrayList;
import java.util.List;

public class ModifiedProxy extends Subject {

    static Subject cs;
    String currentUser;
    List<String> registeredUsers;

    public ModifiedProxy(String currentUser) {
        this.currentUser = currentUser;
        this.registeredUsers = new ArrayList<>();
        this.registeredUsers.add("Admin");
        this.registeredUsers.add("Betty");
        this.registeredUsers.add("Charlie");

    }

    @Override
    public void doSomeWork() {

        System.out.println("Proxy call happening now...");
        System.out.println(this.currentUser + " wants to invoke a proxy method.");
        if (this.registeredUsers.contains(this.currentUser)) {
            if (cs == null) {
                cs = new ConcreteSubject();
            }
            cs.doSomeWork();
        } else {
            System.out.println("Sorry " + this.currentUser + " , you do not have access rights.");
        }

    }
}
