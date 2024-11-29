package InterviewCodeQues.String;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
// Given an array of strings, group anagrams together.

// For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
// Return:

    // [
//   ["ate", "eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]
// Note: All inputs will be in lower-case.

public static List<List<String >> ana(String[] arr){
    Map<String, List<String>> anag = new HashMap<>();
    for(String s: arr){
        char[] ch=  s.toCharArray();
        Arrays.sort(ch);
        String sor =new String(ch);

        if(anag.containsKey(sor)){
            anag.get(sor).add(s);
        }else{
            anag.put(sor,new ArrayList<>());
            anag.get(sor).add(s);
        }
    }
    return new ArrayList<>(anag.values());
}
    public static void main(String args[]){

        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        ana(arr).stream().forEach(x->System.out.println(x));

    }
}
