package JavaEight;

import java.util.ArrayList;
import java.util.List;

public class JavaEightMethodReference {
    public static void main(String[] args) {

        List<String> s = List.of("khant", "vyas","ast","het");
        List<Integer> i = new ArrayList<>() ;
        s.stream().map(x->x.length()).forEach(i::add);
        i.forEach(System.out::println);
    }
}
