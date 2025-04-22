package InterviewCodeQues.JAVAEIGHT;

import java.util.List;

public class ReduceMethod {

    public static void main(String args[]) {
        List<String> listObj = List.of("vyas","patel","shah");
        List<Integer> integerList = List.of(3,5,7);
// use of reduce function in java 8
        System.out.println(" int -->"+integerList.stream().reduce(0,(x1,x2)->x1+x2) );
        System.out.println(" str -->"+listObj.stream().reduce("",(x1,x2)->String.valueOf(x1+x2.charAt(0))));
    }
}
