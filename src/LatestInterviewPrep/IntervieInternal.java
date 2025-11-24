package LatestInterviewPrep;

import java.util.*;
import java.util.stream.Collectors;

public class IntervieInternal {

    // find 1st non repeting character

    public static void main(String[] args){
        String s = "swissat";
     LinkedHashMap<Character,Long> lmap =   s.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x, LinkedHashMap::new,Collectors.counting()));
     Optional<Character> c=   lmap.entrySet().stream().filter(x->x.getValue()==1).map(x->x.getKey()).findFirst();
    System.out.println("1st non repeting char is :"+c.get());

        List<Employee1> employees = Arrays.asList(
                new Employee1("Alice","IT",70000),
                new Employee1("Bob","HR",50000),
                new Employee1("Charlie","IT",90000),
                new Employee1("David","HR",60000)
        );


        Map<String ,Optional<Employee1>> ans = employees
                .stream().collect(Collectors.groupingBy(x->x.dept,Collectors.maxBy(Comparator.comparingDouble(x-> x.salary))));
    ans.entrySet().stream().forEach(x->System.out.println("Dept "+x.getKey()+" sal "+x.getValue().get().salary));
    }

}
