package InterviewCodeQues.JAVAEIGHT;

import java.util.List;

public class MatchProblem {

    public static void main(String args[]) {

        List<Integer> list = List.of(2,4,4,7,3,8,9,1,90,33);
        List<Integer> list1 = List.of(2,4,4,8,90);
// even if single element matches its true
        System.out.println(" Any match is even--> "+list.stream().anyMatch(item->item%2==0));
// if all elements matches its true
        System.out.println(" All match is even--> "+list1.stream().allMatch(item->item%2==0));
// if none elements matches its true
        System.out.println(" None match is even--> "+list1.stream().noneMatch(item->item%2==1));

    }
}
