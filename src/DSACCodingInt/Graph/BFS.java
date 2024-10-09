package DSACCodingInt.Graph;

import java.sql.Array;
import java.util.*;

public class BFS {

    public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj){

        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] vis = new boolean[v];
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        vis[1]=true;
        while (!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            for(Integer it : adj.get(node)){

                if(vis[it]==false){
                    vis[it]=true;
                    q.add(it);
                }
            }



        }
return bfs;

        // o(N) +o(2E) time complexity
        // space complexity 3 O(N)
    }

    public  static  void main(String args[]){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        adj.add(l1);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(2);l2.add(6);
        adj.add(l2);
        ArrayList<Integer> l = new ArrayList<>();
        l.add(3);l.add(4);l.add(1);
        adj.add(l);
        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(2);
        adj.add(l3);
        ArrayList<Integer> l4 = new ArrayList<>();
        l4.add(2);l4.add(5);
        adj.add(l4);
        ArrayList<Integer> l5 = new ArrayList<>();
        l5.add(4);l5.add(8);
        adj.add(l5);
        ArrayList<Integer> l6 = new ArrayList<>();
        l6.add(1);l6.add(7);l6.add(9);
        adj.add(l6);
        ArrayList<Integer> l7 = new ArrayList<>();
        l7.add(6);l7.add(8);
        adj.add(l7);
        ArrayList<Integer> l8 = new ArrayList<>();
        l8.add(7);l8.add(5);
        adj.add(l8);
        ArrayList<Integer> l9 = new ArrayList<>();
        l9.add(6);
        adj.add(l9);

        BFS bfs = new BFS();

        adj.stream().forEach((x)->{System.out.println("->"+x);});
       bfs.bfsOfGraph(10,adj).stream().forEach(x->System.out.print(" ->"+x));


    }
}
