package behavioral.memento.second;

public class AnotherMementoDemo {
    public static void main(String[] args) {
        Person arne = new Person("Arne", 35, 69);
        PersonMemento snapshot = arne.getMemento();

        System.out.println(arne + " (initially)");

        for (int i = 0; i < 10; i++) {

            arne.processBirthday();
            System.out.println(arne);
        }

        snapshot.resetState();
        System.out.println(arne + " (after reset)");
    }
}
