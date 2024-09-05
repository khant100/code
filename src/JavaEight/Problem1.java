package JavaEight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem1 {
// find the word with maximum and minumum length in given string
//  If more then 2 word have same length select one occurance basis
    public static void main(String[] args) {

        String  s = "we belong to Russia";
        String[] arry = s.split(" ");

       String min = List.of(arry).stream().min(Comparator.comparingInt(String :: length).
                thenComparing(x-> Arrays.asList(arry).indexOf(x))).get();
       String mi  = Arrays.stream(arry).min(Comparator.comparingInt(String::length).thenComparing(
               x-> Arrays.asList(arry).indexOf(x)
       )).get();

        String max = List.of(arry).stream()
                .max(Comparator.comparingInt(String::length).
                        thenComparing(x->Arrays.asList(arry).indexOf(x))).get();


        System.out.println("mix: "+min+"  max: "+max);
    }
}
