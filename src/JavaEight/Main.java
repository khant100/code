package JavaEight;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Main{
    public static void main(String[] args) {

        List<List<Integer>> listOfLists = Arrays.asList(            Arrays.asList(1, 2, 3),            Arrays.asList(4, 5, 6),            Arrays.asList(7, 8, 9)    );

//        List<Integer> transformedList = listOfLists.stream().
//                flatMap(e->e.stream().mapToInt(n->(int) n).map(e ->List)).collect(Collectors.toList());
//        listOfLists.stream().flatMap(l->l.stream()).collect(Collectors.toList()).forEach(i->System.out.print(i));

        Double[] prics = {2.3d,3.0d,5.0d,6.7d,7.1d,3.1d,9d,1.0d,2.3d};

        List<Double> sortedPrices = Arrays.asList(prics);
        List<Double> finalPrice= sortedPrices.stream().filter(x->x>3d).collect(Collectors.toList());

     // Map<Character,Integer> m= Arrays.stream("abb".chars().toArray()).collect(Collectors.groupingBy(c->c,Collectors.counting()));
     // m.entrySet().stream().filter(x->x.getValue().intValue()%2==0).collect(Collectors.toList()).size()



        String s = "w";
        Map<Character,Long> smap=  s.chars().mapToObj(e -> (char)e).
                collect(Collectors.toList()).stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));

        int siz=  smap.entrySet().stream().filter(x->x.getValue().intValue()%2==0).collect(Collectors.toList()).size();

        List<List<Integer>> listOfLists1 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> list2 = listOfLists1.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
       System.out.println(listOfLists.stream().flatMap(List::stream).collect(Collectors.toList()));
//        System.out.println(" "+list2);
//        System.out.println(" "+finalPrice);
//        System.out.println(" "+sortedPrices);
    }
}