package behavioral.memento.second;

public class Person {
    private String name;
    private int age;
    private double weight;

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void processBirthday() {
        this.age++;
        if (this.age >= 40) {
            this.weight += 10;
        }
    }

    @Override
    public String toString() {
        return this.name + " at " + this.age + " weighs " + this.weight + "kg";
    }

    public PersonMemento getMemento() {
        return new LocalMemento();
    }

    private class LocalMemento implements PersonMemento {

        int storedAge;
        double storedWeight;

        public LocalMemento() {
            this.storedAge = age;
            this.storedWeight = weight;
        }

        @Override
        public void resetState() {
            age = this.storedAge;
            weight = this.storedWeight;
        }
    }


}
