package LatestInterviewPrep;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeTest {
    public static void main(String[] args){
        List<Employee> employeesList = new LinkedList<>();
        employeesList.add(new Employee("vya","IT",100000d));
        employeesList.add(new Employee("vya","hr",50000d));
        employeesList.add(new Employee("vya","IT",200000d));
        employeesList.add(new Employee("vya","hr",70000d));
        employeesList.add(new Employee("vya","IT",10000d));
        employeesList.add(new Employee("vya","a",70000d));
        employeesList.add(new Employee("vya","IT",150000d));

        employeesList.stream().collect(Collectors.groupingBy(x->x.getDept(),Collectors.averagingDouble(x->x.getSalary())))
                .entrySet().forEach(x->System.out.println("Dept : "+x.getKey()+" Avg sal : "+x.getValue()));

    }
}
