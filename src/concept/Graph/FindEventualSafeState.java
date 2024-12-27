package concept.Graph;


//Problem Statement: A directed graph of V vertices and E edges is given in the form of an adjacency
// list adj. Each node of the graph is labeled with a distinct integer in the range 0 to V - 1.
// A node is a terminal node if there are no outgoing edges.
// A node is a safe node if every possible path starting from that node leads to a terminal node.
// You have to return an array containing all the safe nodes of the graph.
// The answer should be sorted in ascending order.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindEventualSafeState {

    public static boolean checkdfs(int node,int[] vis,List<List<Integer>> adj,int[] pathVis,int[] checked){
        vis[node]=1;
        pathVis[node]=1;
        checked[node]=0;
        for(Integer i : adj.get(node)){
            if(vis[i]==0) {
                if (checkdfs(i,vis,adj,pathVis,checked)==true){
                    return true;
                } }else if (pathVis[i]==1) {
                    return true;
                }
            }
        checked[node]=1;
        pathVis[node]=0;
        return false;
    }
    public  static List<Integer> isSafeSpace(int V,List<List<Integer>> adj){
        int[] vis = new int[V];
        int[] patVis = new int[V];
        int[] checked = new int[V];

        for(int i=0;i<V;i++){
            if(vis[i]==0){
                checkdfs(i,vis,adj,patVis,checked);
            }
        }

        List<Integer> safNode = new ArrayList<>();
        for(int i=0;i<V;i++){
            if(checked[i]==1){
                safNode.add(i);
            }

        }
        return safNode;
    }
    public static void main(String args[]){
        int V = 12;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(4).add(6);
        adj.get(5).add(6);
        adj.get(6).add(7);
        adj.get(8).add(1);
        adj.get(8).add(9);
        adj.get(9).add(10);
        adj.get(10).add(8);
        adj.get(11).add(9);
        isSafeSpace(12,adj).stream().forEach(x->System.out.print("-"+x));

    }
}
