package concept.recursion;

import java.util.ArrayList;
import java.util.List;

public class Mcolors {

   private static boolean graphColoring(List<Integer>[] G, int[] color, int node, int M){
        int n =G.length;
        if(solve(G,color,node,n,M)==true){
            return true;
        }else{
            return false;
        }
    }

    private static boolean isSafe(List<Integer>[] G,int[] color,int node,int M,int col){
       for(int it : G[node]){
           if (color[it]==col){
               return false;
           }
       }
       return true;


    }
    private static boolean solve(List<Integer>[] G,int[] color,int node,int n,int M){
      if(node==n)return true;
        for (int i=1;i<=M;i++){
       if(isSafe(G,color,node,M,i)){
            color[node]=i;
            solve(G,color,node+1,n,M);
            color[node]=0;
        }
        }
        return false;
    }
    public static void main(String[] args) {
        int N = 4, M = 3;
        List< Integer >[] G = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            G[i] = new ArrayList< >();
        }
        G[0].add(1);
        G[1].add(0);
        G[1].add(2);
        G[2].add(1);
        G[2].add(3);
        G[3].add(2);
        G[3].add(0);
        G[0].add(3);
        G[0].add(2);
        G[2].add(0);
        int[] color = new int[N];
        boolean ans = graphColoring(G, color, 0, M);
        if (ans == true)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
