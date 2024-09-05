package DSA.medium.DFS;

import java.util.ArrayList;
import java.util.List;

//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
//
//        A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
public class PhoneDirectory {

    List<String> result = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    String[] phone = {"0","0","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};


    private List<String> retcomb(String digit){
        if(digit.length()==0){
            return result;
        }
        combonation(0,digit);

    return result;
    }
    private void combonation(int index,String digit){
    if(index==digit.length()){
        result.add(sb.toString());
        return;
    }
    String keyPad= phone[digit.charAt(index)-'0'];

    for(char c: keyPad.toCharArray()){
        sb.append(c);
        System.out.println(" "+sb.toString());
        combonation(index+1,digit);
        sb.deleteCharAt(sb.length()-1);
        System.out.println(" "+sb.toString());
    }

    }


    public static void main(String args[]){
        PhoneDirectory phoneDirectory = new PhoneDirectory();

    System.out.println(" Output is "+phoneDirectory.retcomb(""));



    }
}
