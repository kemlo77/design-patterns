package behavioral.memento.first;

import java.util.ArrayList;
import java.util.List;

public class ModifiedMementoPatternExample {
    public static void main(String[] args) {
        List<Memento> savedStateIds = new ArrayList<>();
        Originator originator = new Originator();
        Memento memento;

        originator.setStateId(1);
        memento = originator.saveMemento(originator.getStateId());
        savedStateIds.add(memento);
        System.out.println("Snapshot #1: Originators's current state id is saved in caretaker.");

        originator.setStateId(2);
        memento = originator.saveMemento(originator.getStateId());
        savedStateIds.add(memento);
        System.out.println("Snapshot #2: Originators's current state id is saved in caretaker.");

        originator.setStateId(3);
        memento = originator.saveMemento(originator.getStateId());
        savedStateIds.add(memento);
        System.out.println("Snapshot #3: Originators's current state id is saved in caretaker.");

        System.out.println("Started restoring process... ");
        for (int i = savedStateIds.size(); i > 0 ; i--) {
            originator.revertMemento(savedStateIds.get(i-1));
        }

    }
}
