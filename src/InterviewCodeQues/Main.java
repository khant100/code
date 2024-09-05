package InterviewCodeQues;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("ram","e123",1500000);
        Employee e6 = new Employee("ram","e123",1500000);
        Employee e2 = new Employee("shyam","e456",250000);
        Employee e3 = new Employee("raghu","e789",250000);
        Employee e4 = new Employee("Rahul","e100",100000);
        Employee e5 = new Employee("Rahul","e100",200000);
        Employee e8 = new Employee("Raman","e100",200000);
        Employee e7 = new Employee("Raj","e100",200000);

        List<Employee> lemp = List.of(e1,e2,e3,e4,e5,e6,e7,e8);
                //new ArrayList<>();
//        lemp.add(e1);
//        lemp.add(e2);
//        lemp.add(e3);
//        lemp.add(e4);

        List<Employee> remp = lemp.stream().sorted(Comparator.comparing(e->e.getSal())).collect(Collectors.toList());
        System.out.println("Third Higest  "+lemp.stream()
                .collect(Collectors.groupingBy(x->x.getSal(),Collectors.mapping(x->x.getName(),Collectors.toList())))
                .entrySet().stream().sorted(Comparator.comparing(x->-x.getKey())).collect(Collectors.toList()).get(2));
        System.out.println("Hello world!"+lemp);
        System.out.println("Hello world!"+remp);
        System.out.println(lemp.stream().collect(Collectors.groupingBy(x->x.getName(),Collectors.summingInt(x->x.getSal()))));
    Mul m = (x,y)-> x*y;
        System.out.println(""+m.sqr(5,7));

    }
}