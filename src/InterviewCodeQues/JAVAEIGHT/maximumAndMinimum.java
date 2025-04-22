package InterviewCodeQues.JAVAEIGHT;

import java.util.Arrays;
import java.util.List;

public class maximumAndMinimum {
    public static void main(String args[]) {
        List<Integer> integerList  = Arrays.asList(3,5,7,8,11,1,7,55,3,44,66,88,11,22,34,55,999,444,55) ;
        System.out.println("higest --> "+integerList.stream().max(Integer::compareTo).get());
        System.out.println("Lowest --> "+integerList.stream().min(Integer::compareTo).get());
    }
}
