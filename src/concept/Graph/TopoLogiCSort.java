package concept.Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopoLogiCSort {

    public void dfs(ArrayList<ArrayList<Integer>> adj,int[] vis,Stack<Integer> sc,int node){
        vis[node]=1;

        for(Integer i : adj.get(node)){
            if(vis[i]==0){
                dfs(adj,vis,sc,i);
            }
        }
        sc.push(node);
    }
private ArrayList<Integer> topSort(ArrayList<ArrayList<Integer>> adj){
    int n = adj.size();
    Stack<Integer> st = new Stack<>();
    int[] vis = new int[n];
    for(int i=0;i<n;i++){
        if(vis[i]==0){
            dfs(adj,vis,st,i);
        }
    }
    ArrayList<Integer> ans = new ArrayList<>();
    while(!st.isEmpty()){
        ans.add(st.pop());
    }
    return ans;
}
    public static void main(String[] args) {
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
        TopoLogiCSort top = new TopoLogiCSort();
        top.topSort(adj).stream().forEach(x->System.out.print("-"+x));
    }
}
