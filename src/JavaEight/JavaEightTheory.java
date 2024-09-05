package JavaEight;
import java.lang.annotation.*;
import java.util.Arrays;
import java.util.List;

public class JavaEightTheory {

    // Type annotation
  //  @Repeatable() String str;
    // Type interface used in showList(new ArrayList<>());
    // passing it interfac with new keyword
    // parallel shorting of arrya with Method Arrays.paralleSort
    public static void main(String[] args) {
        int[] in = {2,9,7,1,8,3,10,4,18,11,4,20,5};
        Arrays.stream(in).forEach(x->System.out.print(" "+x));
        System.out.println();
        Arrays.parallelSort(in);
        Arrays.stream(in).forEach(x->System.out.print(" "+x));
    }
}
