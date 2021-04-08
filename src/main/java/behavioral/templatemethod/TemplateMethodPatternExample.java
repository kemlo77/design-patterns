package behavioral.templatemethod;

public class TemplateMethodPatternExample {

  public static void main(String[] args) {
    System.out.println("***Template Method Pattern Demo***\n");

    BasicEngineering computerScCourse = new ComputerScience();
    System.out.println("Computer Sc course will be completed in following order");
    computerScCourse.completeCourse();
    
    System.out.println("");

    BasicEngineering electronicScCourse = new ComputerScience();
    System.out.println("Electronics Sc course will be completed in following order");
    electronicScCourse.completeCourse();

  }

}
