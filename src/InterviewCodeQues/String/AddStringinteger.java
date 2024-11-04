package InterviewCodeQues.String;

public class AddStringinteger {

    // add large numbers with string as input
    // without using BigInteger addition

    public boolean verify(String a){
        for(char c : a.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    // sum large numbers
    private static String sum(String a,String b){
        // 11111
        // 88888
        StringBuilder sb = new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry =0;
        while(i>=0||j>=0){
            if(i>=0&&j>=0){
                int index1 = Integer.parseInt(String.valueOf(a.charAt(i)));
                int index2 = Integer.parseInt(String.valueOf(b.charAt(j)));
                int index3 = index1+index2;
                sb.append(index3%10+carry);

                if(index3>9){
                    carry=1;
                }else{
                    carry=0;
                }
                i--;
                j--;
            }
            if(i<0&&j>=0){
                int index4 = carry+Integer.parseInt(String.valueOf(b.charAt(j)));
                sb.append(index4%10);
                if(index4>9){
                    carry=1;
                }else{
                    carry=0;
                }
                j--;
            }
            if(j<0&&i>=0){
                int index4 = carry+Integer.parseInt(String.valueOf(a.charAt(i)));
                sb.append(index4%10);
                if(index4>9){
                    carry=1;
                }else{
                    carry=0;
                }
                i--;

            }

        }
        if(carry==1){
            sb.append(carry);
        }



        return sb.reverse().toString();
    }
    public String addNumbers(String a,String b){
        int i =0;
        int j=0;

        if(a.length()!=0){
            if(verify(a)){
                i=Integer.parseInt(a);
            }else {
                System.out.println("enter in number format");
                return "";
            }

        }
        if(b.length()!=0){
            if(verify(b)){
                j=Integer.parseInt(b);
            }else {
                System.out.println("enter in number format");
                return "";
            }
        }
        return String.valueOf(i+j);

    }

    private static long  sum(int a ,int b){

        return a+b;
    }

    public static void main(String args[]){
        AddStringinteger in = new AddStringinteger();
        System.out.println(in.addNumbers("0j","989"));
        System.out.println(in.addNumbers("","222"));
        System.out.println(in.addNumbers("000123","123"));
        System.out.println("Sum of 2 numbers are "+sum(3333,7777));
        System.out.println("Sum of 2 numbers in String Format "+sum("3333","7777"));
        System.out.println("Sum of 2 numbers are "+sum(3333,4444));
        System.out.println("Sum of 2 numbers in String Format "+sum("3333","4444"));
        System.out.println("Sum of 2 numbers are "+sum(33,7777));
        System.out.println("Sum of 2 numbers in String Format "+sum("33","7777"));
        System.out.println("Sum of 2 numbers in String Format "+sum("33333333333","99999999999999"));
    }
}
