package InterviewCodeQues.String;

public class AddStringinteger {

    public boolean verify(String a){
        for(char c : a.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
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


    public static void main(String args[]){
        AddStringinteger in = new AddStringinteger();
        System.out.println(in.addNumbers("0j","989"));
        System.out.println(in.addNumbers("","222"));
        System.out.println(in.addNumbers("000123","123"));
    }
}
