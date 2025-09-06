package InterviewPractice;

import java.util.function.Function;
import java.util.stream.Collectors;

// write a program name = "praveen"
// write a character counter in 1 and store in list .

public class NameTocarr {
    public static void main(String args[]){
        String input = "Praveen";

        input.chars().mapToObj(x->(char)x).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().map(x->x.getKey()+"="+x.getValue()).forEach(System.out::println);

    }
}
