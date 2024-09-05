package JavaConcept;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDeQueue {

  //  Queue<int[]> queue = new ArrayDeque<>();
    public static void main(String[] args) {
        Queue<int[]> queue = new ArrayDeque<>();

        int x=3;
        int y=6;
        queue.offer(new int[]{x,y});
        queue.offer(new int[]{5,7});
        queue.offer(new int[]{2,9});
        queue.offer(new int[]{1,11});

        System.out.println(queue);
        int[] drr =queue.poll();

        System.out.println(drr[0]+" --"+drr[1]);
        int[] brr=queue.poll();
        System.out.println(brr[0]+"---:"+brr[1]);
    }
}

