package behavioral.iterator.first;

public class IteratorPatternExample {
    public static void main(String[] args) {
        System.out.println("***Iterator Pattern Demo***");

        Arts artsSubjects = new Arts();
        Iterator iteratorForArts = artsSubjects.createIterator();

        System.out.println("Arts subjects are as follows:");
        while (iteratorForArts.hasNext()) {
            System.out.println(iteratorForArts.next());
        }


        iteratorForArts.first();
        System.out.println("current item: " + iteratorForArts.currentItem());
    }
}
