package DSACCodingInt.Sorting;

import java.lang.reflect.Array;
import java.util.*;

// sort arrays of sting such that anagrams are near by
public class Anagrams {

    private static String[] sortArry(String[] ana){
        Comparator<String> com = new Comparator<String>() {

            private String sortChar(String s){
                char[] charArray = s.toCharArray();
                Arrays.sort(charArray);
                return  new String(charArray);
            }
            @Override
            public int compare(String o1, String o2) {
                return sortChar(o1).compareTo(sortChar(o2));
            }
        };

        Arrays.sort(ana,com)  ;


return ana;
    }


    private static String[] sortArray2(String[] ana){
        Map<String, List<String>> map = new HashMap<>();

        for(int i=0;i<ana.length;i++){
            if(!map.containsKey(sorted(ana[i]))){
                List<String> list = new ArrayList<>();
                map.put(sorted(ana[i]),list);
            }
                map.get(sorted(ana[i])).add(ana[i]);

        }
        int i=0;
        for(Map.Entry<String,List<String>> m : map.entrySet()){
            for(String s : m.getValue()){
                ana[i++]=s;
            }

        }
    return ana;

    }
    private static String sorted(String str){
        char[] cArry = str.toCharArray();
        Arrays.sort(cArry);
        return new String(cArry);
    }


    public static void main(String[] args){

        String[] sarray = {"ab", "ba", "aad", "dda", "add", "ada"};
        System.out.println(Arrays.toString(sortArry(sarray)));
        System.out.println(Arrays.toString(sortArray2(sarray)));


    }

}

