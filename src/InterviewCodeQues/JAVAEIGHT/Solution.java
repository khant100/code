package InterviewCodeQues.JAVAEIGHT;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String args[]) {

List<Employee> list = List.of(new Employee("kahnt", 200000, 33),
        new Employee("Hitesh", 200000, 33),new Employee("Prity", 250000, 39) );
       System.out.println( list.stream().collect(Collectors.groupingBy(x->x.getAge(),Collectors.groupingBy(x->x.getSal(),Collectors.mapping(x->x.getName(),Collectors.toList()))))
        );
    }
}
