package InterviewCodeQues.JAVAEIGHT;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertString {
// Questio asked in infinity interview
    public static void main(String args[]) {
        String s ="jan.feb.mar.apr.may.june.july.aug";
        Arrays.stream(s.split("\\.")).collect(Collectors.toList()).forEach(x->System.out.println(x));
    }


}
