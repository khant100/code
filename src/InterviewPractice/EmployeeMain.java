package InterviewPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
   // 1)	get top 5 emp salary in each dept where department name consist of _ and space. Treat such department name as one
//for eg. HR dept, HR_dept both are considered as HRDept (can use java 8 or without java 8)

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR dept", 70000d),
                new Employee("Bob", "HR_dept", 80000d),
                new Employee("Charlie", "HR_dept", 75000d),
                new Employee("David", "HR dept", 72000d),
                new Employee("Eve", "HR_dept", 71000d),
                new Employee("Frank", "HR dept", 69000d),
                new Employee("Grace", "Finance Dept", 90000d),
                new Employee("Heidi", "Finance_Dept", 88000d),
                new Employee("Ivan", "Finance Dept", 87000d),
                new Employee("Judy", "Finance_Dept", 86000d),
                new Employee("Mallory", "Finance Dept", 85000d),
                new Employee("Niaj", "Finance_Dept", 84000d)
        );

        Map<String,List<String>> deptName =
                employees.stream()
                .collect(Collectors.groupingBy(x->x.getDept().replaceAll("_"," "),Collectors.mapping(x->x.getName(),Collectors.toList())));
        Map<String,List<Employee>> deptName1 = employees.stream()
                .collect(Collectors.groupingBy(x->x.getDept().replaceAll("_"," "),Collectors.collectingAndThen(Collectors.toList(),
                        list->list.stream().sorted(Comparator.comparingDouble(emp-> -emp.getSalary())).limit(5)
                                .collect(Collectors.toList()))));
        deptName.entrySet().forEach(x->System.out.println("dept ="+x.getKey()+" "+x.getValue()));
        deptName1.entrySet().forEach(x->System.out.println("dept ="+x.getKey()+" "+x.getValue()));

    }
}
