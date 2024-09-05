package DSA.Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

//Starting with a 1-indexed array of zeros and a list of operations,
// for each operation add a value to each the array element between two given indices,
// inclusive. Once all operations have been performed, return the maximum value in the array.
//
//        Example
//Queries are interpreted as follows:
//
//        a b k
//        1 5 3
//        4 8 7
//        6 9 1
//        Add the values of  between the indices  and  inclusive:
//
//        index->	 1 2 3  4  5 6 7 8 9 10
//        [0,0,0, 0, 0,0,0,0,0, 0]
//        [3,3,3, 3, 3,0,0,0,0, 0]
//        [3,3,3,10,10,7,7,7,0, 0]
//        [3,3,3,10,10,8,8,8,1, 0]
//        The largest value is  after all operations are performed.
//
//        Function Description
//
//        Complete the function arrayManipulation in the editor below.
//
//        arrayManipulation has the following parameters:
//
//        int n - the number of elements in the array
//        int queries[q][3] - a two dimensional array of queries where each queries[i]
//        contains three integers, a, b, and k.
//        Returns
//
//        int - the maximum value in the resultant array
//        Input Format
//
//        The first line contains two space-separated integers  and , the size of the array
//        and the number of operations.
//        Each of the next  lines contains three space-separated integers ,
//        and , the left index, right index and summand.
//
//        Constraints
//
//        Sample Input
//
//        5 3
//        1 2 100
//        2 5 100
//        3 4 100
//        Sample Output
//
//        200
//        Explanation
//
//        After the first update the list is 100 100 0 0 0.
//        After the second update list is 100 200 100 100 100.
//        After the third update list is 100 200 200 200 100.
//
//        The maximum value is 200 .
public class problem1 {


    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here

        final Map<Integer, Long> deltas = new TreeMap<>();
        queries.forEach(query -> {

            int a = query.get(0);
            int b = query.get(1);
            int k = query.get(2);

            final long deltaA = deltas.computeIfAbsent(a, key -> 0l);
            final long deltaB = deltas.computeIfAbsent(b+1, key -> 0l);
            System.out.println("Map after delta"+deltas);
            System.out.println("deltaA"+deltaA);
            System.out.println("deltaB"+deltaB);
            deltas.put(a, deltaA + k);
            System.out.println("Map"+deltas);
            deltas.put(b+1, deltaB - k);
            System.out.println("Map"+deltas);
        });
        System.out.println("map"+deltas);
        long max = 0;
        long current = 0;
        for(long delta: deltas.values()) {
            current += delta;
            System.out.println("current"+current);
            max = max < current ? current : max;
        }
        return max;
    }


    public static void main(String[] args) {

      // write code to count item in list

        List<Integer> l1 = new ArrayList<>(){{add(1);add(2);add(100);}};
        List<Integer> l2 = new ArrayList<>(){{add(2);add(5);add(100);}};
        List<Integer> l3 = new ArrayList<>(){{add(3);add(4);add(100);}};

        List<List<Integer>> queries1 = new ArrayList<>(){{add(l1);add(l2);add(l3);}};
        int n1=5;
        int n2=10;
        List<Integer> l11 = new ArrayList<>(){{add(1);add(5);add(3);}};
        List<Integer> l21 = new ArrayList<>(){{add(4);add(8);add(7);}};
        List<Integer> l31 = new ArrayList<>(){{add(6);add(9);add(1);}};

        List<List<Integer>> queries2 = new ArrayList<>(){{add(l11);add(l21);add(l31);}};

        System.out.println("Max queue"+arrayManipulation(5,queries1));
        System.out.println("Max queue"+arrayManipulation(4,queries2));
    }
}
