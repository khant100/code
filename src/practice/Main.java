package practice;

import java.util.*;
import java.util.stream.Collectors;

public interface Main {
    public static void main(String args[]){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("vyas",33));
        personList.add(new Person("mukesh",17));
        personList.add(new Person("Abhishek",32));
        personList.add(new Person("Avinash",18));
        personList.add(new Person("Pryanshu",28));

       System.out.println(personList.stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName)).collect(Collectors.toList()));
        Map<Integer,String > map = new HashMap<>();
        map.put(1,"ram");
        map.put(2,"isha");
        map.put(3,"raj");
        map.put(4,"isha");
        map.entrySet().stream().collect(Collectors.groupingBy(x->x.getValue(),Collectors.counting())).entrySet().stream().forEach(x->System.out.println("name "+x.getKey()+" occured "+x.getValue()));

       personList.stream().filter(x->x.getAge()>=18).sorted(Comparator.comparingInt(Person::getAge).reversed()).map(x->x.getName()).forEach(System.out::println);
        List<Employee> employeeList = new ArrayList();
        employeeList.add(new Employee("Suresh", 2000.0, List.of("aa") ));
        employeeList.add(new Employee("Suresh1",2010.0,List.of("aa")));
        employeeList.add(new Employee("Suresh2",2000.0,List.of("aa")));
        employeeList.add(new Employee("Suresh3",2020.0,List.of("aa")));
        employeeList.add(new Employee("Suresh4",2300.0,List.of("aa")));
        Map<Double,List<Employee>>   employeeGroup = employeeList.stream().collect(Collectors.groupingBy(Employee::getSalary));
        employeeGroup.entrySet().forEach(e1-> System.out.println(e1.getKey()+""+e1.getValue()));
        employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(e1->System.out.println(e1.toString()));
    }
    }

