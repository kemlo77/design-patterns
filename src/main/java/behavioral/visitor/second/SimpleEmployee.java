package behavioral.visitor.second;

public class SimpleEmployee implements Employee {

    private String name;
    private String dept;
    private int yearsOfExperience;

    public SimpleEmployee(String name, String dept, int yearsOfExperience) {
        this.name = name;
        this.dept = dept;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public void printStructures() {
        System.out.println("\t\t" + this.name + " works in "
                + this.dept + ". Experience: " + this.yearsOfExperience + " years");
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitTheElement(this);
    }
}
