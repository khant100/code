package JavaTEN;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// use of new var type
public class JavaTen {
    // use of var in java 10 added
    // new collection where collectors.unmodfiable collection introduced
    public static void main(String[] args) {
        var a  = 10;
        var b ="khant";

        var map = new HashMap<String , List<String>>();

        for(var entry : map.entrySet()){
            var val = entry.getValue();
        }

        var list = new ArrayList<>();
        list.add(123);
        list.add("abc");
        list.add('d');
    List<Integer> list1 = List.of(1,6,3,5,7,10,18,19,20,30,60);
    List<Integer> list2 = list1.stream().filter(x->x%3==0).collect(Collectors.toUnmodifiableList());
list2.add(66);
    }
}
