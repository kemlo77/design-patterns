package creational.singleton;

public class SingletonPatternExample {

  public static void main(String[] args) {

    System.out.println("***Singleton Pattern Demo***");
    Captain captain1 = Captain.getCaptain();
    Captain captain2 = Captain.getCaptain();

  }

}
