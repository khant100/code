package LatestInterviewPrep;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IdentifyPalindrone {

    public static boolean isPalindron(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {

        List<String> list =List.of("aa" ,"ddd","I","lkjskjd","fbdr");
                list.stream().sorted(Comparator.comparingInt(String::length)).forEach(x->System.out.print(x+" "));


        String s= "A man , a plan , a canal: Panama";
        System.out.println(s+" palindrone check : "+isPalindron(s.replaceAll("[^A-Za-z0-9]","").toLowerCase()));

    }
}
