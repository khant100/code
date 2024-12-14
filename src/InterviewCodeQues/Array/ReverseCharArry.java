package InterviewCodeQues.Array;

public class ReverseCharArry {

    private static void swap(char[] arry,int i,int j){
        char a = arry[i];
        arry[i]=arry[j];
        arry[j]=a;

    }
    public static void main(String args[]){

        char[] arry = {'k','h','a','n','t'};
        System.out.println(String.valueOf(arry));
        int i=0;
        int j=arry.length-1;
        while(i!=j){
            swap(arry,i,j);
            i++;
            j--;
        }

        System.out.println(String.valueOf(arry));

    }
}
