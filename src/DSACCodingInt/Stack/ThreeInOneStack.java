package DSACCodingInt.Stack;

public class ThreeInOneStack {

    private final int noOfStack = 3;
    private final int sizeOfStack = 100;

    int[] values = new int[noOfStack*sizeOfStack];

    int[] sizeStack = {-1,-1,-1};


    private void push(int value, int stack) throws Exception {
        if(stack<0||stack>=noOfStack){
            throw new Exception("invalid Stack");
        }
        if(sizeStack[stack]>=sizeOfStack){
            throw new Exception("out of storage");
        }
        sizeStack[stack]=sizeStack[stack]+1;
        values[sizeStack[stack]+sizeOfStack*stack]=value;
    }

    private int pop(int stack) throws Exception {
        if(stack<0||stack>=noOfStack){
            throw new Exception("invalid Stack");
        }
        if(sizeStack[stack]==-1){
            throw new Exception("Stack under flow");
        }
        int popvalue =  values[sizeStack[stack]+sizeOfStack*stack]=0;
        sizeStack[stack]=sizeStack[stack]-1;
        values[sizeStack[stack]+sizeOfStack*stack+1]=0;
        return popvalue;
    }

    private int peek(int stack) throws Exception {
        if(sizeStack[stack]==-1){
            throw new Exception("No element present");
        }
        return values[stack*sizeOfStack+sizeStack[stack]];
    }

    private void printin(){
        for(int i=0;i<3;i++){
            System.out.print("Stack no "+i);
            for(int j=0;j<=sizeStack[i];j++){
                System.out.print(" "+values[i*sizeOfStack+j]);
            }
            System.out.println();
        }
        System.out.println("---------------->---------------------------->");
    }
    public static void main(String[] args) throws Exception {
        ThreeInOneStack threeInOneStack = new ThreeInOneStack();
        threeInOneStack.push(22,0);
        threeInOneStack.push(33,0);
        threeInOneStack.push(44,0);
        threeInOneStack.push(21,1);
        threeInOneStack.push(41,1);
        threeInOneStack.push(61,1);
        threeInOneStack.push(2,2);
        threeInOneStack.push(3,2);
        threeInOneStack.printin();
        threeInOneStack.pop(1);
        threeInOneStack.pop(0);
        threeInOneStack.printin();

    }
}
