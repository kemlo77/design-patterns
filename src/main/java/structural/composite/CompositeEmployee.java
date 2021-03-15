package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements IEmployee {

    private int employeeCount = 0;
    private String name;
    private String dept;
    private List<IEmployee> controls;

    public CompositeEmployee(String name, String dept) {
        this.name = name;
        this.dept = dept;
        this.controls = new ArrayList<>();
    }

    public void addEmployee(IEmployee employee) {
        this.controls.add(employee);
    }

    public void removeEmployee(IEmployee employee) {
        this.controls.remove(employee);
    }

    @Override
    public void printStructures() {
        System.out.println("\t" + this.name + " works in "
                + this.dept);
        this.controls.forEach(IEmployee::printStructures);
    }

    @Override
    public int getEmployeeCount() {
        int inferiorLevelEmployeeCount =
                this.controls.stream()
                        .mapToInt(IEmployee::getEmployeeCount)
                        .sum();
        return this.controls.size() + inferiorLevelEmployeeCount;
    }
}
