package DSACCodingInt.StringClass;


// there is only 1 character to replace for both words to be same

//{"pale", "pse", "false"},
//        {"acdsfdsfadsf", "acdsgdsfadsf", "true"},
//        {"acdsfdsfadsf", "cdsfdsfadsf", "true"},
//        "pale", "pkle"
public class oneWayEditDistace {


    private Boolean OnlyOneDiff(String s1, String s2){
        if(s1.length()==s2.length()){
            return replaceOneChar(s1,s2);
        }
        if (s1.length()==s2.length()+1){
            return addOneChar(s1,s2);
        }
        if (s1.length()+1==s2.length()){
            return addOneChar(s2,s1);
        }
return false;

    }

    private boolean replaceOneChar(String s1,String s2){
        int diff =0;
        for(int  i=0;i<s1.length();i++){

            if(s1.charAt(i)!=s2.charAt(i)){
                diff++;
            }
            if(diff>1){
                return false;
            }
        }
        return true;
    }

    private boolean addOneChar(String s1,String s2){
        // assume s1 is 1 char greater than s2
        int i=0;
                int j=0;
                int toinsert=0;
                if(s1.length()-s2.length()>1){
                    return false;
                }
        while(i<s1.length()&& j<s2.length()){

            if(s1.charAt(i)==s2.charAt(j)){
            i++;
            j++;
            }else{
                i++;
                toinsert++;
            }
            if(toinsert>1){
                return false;
            }
        }
return true;

    }



    public static void main(String[] args) {
        oneWayEditDistace o = new oneWayEditDistace();
        System.out.println(" "+o.OnlyOneDiff("pale","pse"));
        System.out.println(" "+o.OnlyOneDiff("acdsfdsfadsf", "acdsgdsfadsf"));
        System.out.println(" "+o.OnlyOneDiff("acdsfdsfadsf", "cdsfdsfadsf"));
        System.out.println(" "+o.OnlyOneDiff("pale", "pkle"));


    }
}
