package InterviewCodeQues.Array;



//Input: arr[] = [ 4 , 5 , 2 , 25 ]
//        Output:  4      –>   5
//        5      –>   25
//        2      –>   25
//        25     –>   -1
public class PrintNextGreatElement {


    private int getNext(int[] giv, int index){
        for(int i=index+1;i<giv.length;i++){
            if(giv[index]<giv[i]){
                return giv[i];
            }
        }
        return -1;
    }
 private void prinytNextgreat(int[] given){
        for(int i=0;i<given.length;i++){
            int x = getNext(given,i);
            System.out.println("Next great of "+given[i]+"is "+x);
        }



 }
    public static void main(String[] args) {
        int[] given = {4,5,2,25};
        PrintNextGreatElement printNextGreatElement = new PrintNextGreatElement();
        printNextGreatElement.prinytNextgreat(given);
    }
}
