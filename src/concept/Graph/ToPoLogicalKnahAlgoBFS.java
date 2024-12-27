package concept.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ToPoLogicalKnahAlgoBFS {

    ArrayList<Integer> toposortBFS(ArrayList<ArrayList<Integer>> adj,int V){
        int[] indegree = new int[V];

        for(int i=0;i<V;i++) {
            for(Integer it :adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q  = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0) {
                q.add(i);
            }
        }
        ArrayList<Integer> lis = new ArrayList<>();


        while(!q.isEmpty()){
        int node = q.peek();
        q.remove();
        lis.add(node);

        for(int i : adj.get(node)){
            indegree[i]--;
            if(indegree[i]==0){
                q.add(i);
            }
        }

        }
        return lis;

    }
    public static void main(String args[]){
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);
ToPoLogicalKnahAlgoBFS top = new ToPoLogicalKnahAlgoBFS();
        top.toposortBFS(adj,V).stream().forEach(x->System.out.print("-"+x));
    }
}
