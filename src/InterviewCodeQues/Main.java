package InterviewCodeQues;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] aRgs) {

        Employee e1 = new Employee("ram","e123",1500000);
        Employee e6 = new Employee("ram","e123",150000);
        Employee e2 = new Employee("shyam","e456",250000);
        Employee e3 = new Employee("raghu","e789",250000);
        Employee e4 = new Employee("Rahul","e100",100000);
        Employee e5 = new Employee("Rahul","e100",200000);
        Employee e8 = new Employee("Raman","e100",200000);
        Employee e7 = new Employee("Raj","e100",200000);
        Employee e11 = new Employee("Ramu","e101",230000);
        Employee e9 = new Employee("Kishor","e102",210000);
        Employee e10 = new Employee("Miten","e103",220000);


        List<Employee> lemp = List.of(e1,e2,e3,e4,e5,e6,e7,e8);
        List<Employee> empList = List.of(e1,e2,e3,e4,e5,e6,e7,e8);
        List<Employee> empListU = List.of(e1,e6,e3,e4,e5,e11,e9,e10);
 System.out.println(empListU.stream().sorted(Comparator.comparingInt(Employee::getSal).reversed()).limit(5).skip(4).collect(Collectors.toList()));

        List<Employee> remp = lemp.stream().sorted(Comparator.comparing(e->e.getSal())).collect(Collectors.toList());
       System.out.println("------>"+empList.stream().sorted(Comparator.comparing(Employee::getSal))
               .collect(Collectors.toList()).get(empList.size()-2));
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