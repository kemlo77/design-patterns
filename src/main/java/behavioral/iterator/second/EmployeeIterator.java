package behavioral.iterator.second;

import java.util.Iterator;
import java.util.List;

public class EmployeeIterator implements Iterator<Employee> {

    private List<Employee> employeeList;
    private int position;

    public EmployeeIterator(List<Employee> employeeList) {
        this.employeeList = employeeList;
        this.position = 0;
    }

    public void first() {
        this.position = 0;
    }

    public Employee currentItem() {
        return this.employeeList.get(position);
    }

    @Override
    public Employee next() {
        return this.employeeList.get(position++);
    }

    @Override
    public boolean hasNext() {
        return (position < employeeList.size());
    }
}
