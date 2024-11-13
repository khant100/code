package concept.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DirectedGraphCyclic {

    private static boolean checkCycle(ArrayList<ArrayList<Integer>> adj,int v,boolean[] vis,int node){
        vis[node]=true;
        Queue<cair> q = new LinkedList<>();
        q.add(new cair(node,-1));

        while(!q.isEmpty()){
            int child = q.peek().row;
            int parent = q.peek().col;
            q.remove();
            for(Integer it :adj.get(child)){
                if(vis[it]==false){
                    vis[it]=true;
                    q.add(new cair(it,child));
                } else if (it!=parent) {
                    return true;
                }
            }

        }
        return false;
    }
public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
    int v = adj.size();
    boolean[] vis = new boolean[v];
    for(int i=0;i<v;i++){vis[i]=false;}

    for(int i=0;i<v;i++) {
        if (vis[i] == false) {
            if (checkCycle(adj,v,vis,i)) {
                return true;
            }
        }
    }
    return false;
}

private  boolean dfs(ArrayList<ArrayList<Integer>> adj,int v,boolean[] vis,int node,int parent){
        vis[node]=true;
        for(Integer it: adj.get(node)){
            if(vis[it]==false){
                dfs(adj,v,vis,it,node);
            } else if (parent!=it) {
                return true;
            }
        }
        return false;
}
    public boolean isCycledfs(ArrayList<ArrayList<Integer>> adj) {
        int v=adj.size();
        boolean[] vis = new boolean[v];
        for(int i=0;i<v;i++){vis[i]=false;}

        for(int i=0;i<v;i++){
            if(vis[i]==true){
                if(dfs(adj,v,vis,i,-1)==true){
                    return true;
                }
            }
        }

return false;

    }

    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
// time complexity is O(N+2E) + O(N)
        DirectedGraphCyclic obj = new DirectedGraphCyclic();
        boolean ans = obj.isCycle(adj);
        boolean ans1 = obj.isCycledfs(adj);
        if (ans)
            System.out.println("1");
        else
            System.out.println("0");

        if (ans1)
            System.out.println("1");
        else
            System.out.println("0");
    }

}
