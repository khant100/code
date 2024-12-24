package concept.Graph;

import java.util.ArrayList;

public class DetectAcysleInDirectedGraph {
    //Problem Statement: Given a directed graph with V vertices and E edges, check whether it contains any cycle or not.
    private static boolean dfs(ArrayList<ArrayList<Integer>> adj,int[] vis,int[] pathvis,int node){
        vis[node]=1;
        pathvis[node]=1;
        for(Integer i : adj.get(node)){
            if(dfs(adj,vis,pathvis,i)==false){
                return true;
            }
            if(pathvis[i]==1){
                return true;
            }
        }
        pathvis[node]=0;
return false;

    }

    private static boolean isCyclic(ArrayList<ArrayList<Integer>> adj){
        int n = adj.size();
        int[] visited =new int[n];
        int[] pathVis = new int[n];

        for(int i=0;i<n;i++){
            if(visited[i]==0) {
                if (dfs(adj, visited, pathVis, i) == true) {
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int V = 11;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(3).add(7);
        adj.get(4).add(5);
        adj.get(5).add(6);
        adj.get(7).add(5);
        adj.get(8).add(9);
        adj.get(9).add(10);
        adj.get(10).add(8);

        System.out.println(isCyclic(adj));

    }
}
