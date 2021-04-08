package behavioral.visitor.second;

import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements Employee {


    private String name;
    private String dept;
    private final int yearsOfExperience;
    private List<Employee> controls;


    public CompositeEmployee(String name, String dept, int yearsOfExperience) {
        this.name = name;
        this.dept = dept;
        this.yearsOfExperience = yearsOfExperience;
        this.controls = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.controls.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.controls.remove(employee);
    }

    public String getName() {
        return this.name;
    }

    public String getDept() {
        return this.dept;
    }

    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    public List<Employee> getControls() {
        return this.controls;
    }

    @Override
    public void printStructures() {
        System.out.println("\t" + this.name + " works in "
                + this.dept + ". Experience: " + this.yearsOfExperience + " years");
        this.controls.forEach(Employee::printStructures);
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitTheElement(this);
    }
}
