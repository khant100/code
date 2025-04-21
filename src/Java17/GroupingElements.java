package Java17;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingElements {

    record Employee(int id,
                    String name,
                    String dept
                    ){

    }

    public static void main(String[] args){
        List<Employee> emplist = List.of(
                new Employee(1,"ram","IT"),
                new Employee(2,"Manu","IT"),
                new Employee(3,"Laksh","Hr"),
                new Employee(4,"Kishan","IT"),
                new Employee(5,"Abhishek","Admin"),
                new Employee(6,"Gaurav","Hr")
        );

        TreeMap<String,List<Employee>> groupEmployeeByDeptSorted =
                emplist.stream().collect(Collectors.groupingBy(x->x.dept,TreeMap::new,Collectors.mapping(x->x,Collectors.toList())));
        groupEmployeeByDeptSorted.entrySet().forEach(System.out::println);
        LinkedHashMap<String,List<Employee>> groupEmployeeByDeptInOrder =
                emplist.stream().collect(Collectors.groupingBy(x->x.dept, LinkedHashMap::new,Collectors.mapping(x->x,Collectors.toList())));
        groupEmployeeByDeptInOrder.entrySet().forEach(System.out::println);
        Map<String,List<String>> groupNameByDept =
                 emplist.stream().collect(Collectors.groupingBy(x->x.dept,Collectors.mapping(x->x.name,Collectors.toList())));
        groupNameByDept.entrySet().forEach(System.out::println);
    }
}
