package InterviewCodeQues;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeat {

    public static void main(String[] args) {

        String s1 = "googlele";
        String c = "";
        boolean nonrepet = false;
        Map<Character,Integer> cmap = new LinkedHashMap<>();

        for(int i=0;i<s1.length();i++){

            if(cmap.containsKey(s1.charAt(i))){
                cmap.put(s1.charAt(i),cmap.get(s1.charAt(i))+1);
            }else{
                cmap.put(s1.charAt(i),1);
            }
        }



           for(Map.Entry<Character,Integer> ce : cmap.entrySet()){

               if(ce.getValue()==1){
                   c=ce.getKey().toString();
                   //System.out.println("first non-repet charcter : "+c);
                   nonrepet=true;
                   break;
               }

           }

           if(c.equals("")&&nonrepet==false) {
            System.out.println("first non-repet charcter : "+"-1");
            }else{
               System.out.println("first non-repet charcter : " + c + " index is : " + s1.indexOf(c));
           }


    }
}
