package InterviewPractice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapExample {
    // flat map convert 2 maps vale to single list
    public static void main(String[] args) {
        Map<String , List<String>> map1 = new HashMap();
        map1.put("one",List.of("mango","apppel"));
        map1.put("two",List.of("beat","banana"));
        Map<String , List<String>> map2 = new HashMap();
        map2.put("one",List.of("pear","melon"));
        map2.put("two",List.of("chikoo","grapes"));

        List<String> fruits = List.of(map1,map2).stream()
                .flatMap(map->map.values().stream()).flatMap(x->x.stream()).collect(Collectors.toList());

    fruits.stream().forEach(x->System.out.print(x+" "));
    }

}
