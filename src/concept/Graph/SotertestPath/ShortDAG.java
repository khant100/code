package concept.Graph.SotertestPath;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

//Given a Directed Acyclic Graph of V vertices from 0 to n-1 and a 2D Integer array(or vector)
// edges[ ][ ] of length E, where there is a directed edge from edge[i][0] to edge[i][1] with
// a distance of edge[i][2] for all i.
//Find the shortest path from src(0) vertex to all the vertices and
// if it is impossible to reach any vertex, then return -1 for that vertex.
class pair{
    int first;
    int second;
    public pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
public class ShortDAG {
    public void toposort(int node,ArrayList<ArrayList<pair>> adj,int[] vis,Stack<Integer> st){
        vis[node]=1;
        for(int i=0;i<adj.get(node).size();i++){
            int v = adj.get(node).get(i).first;
            if(vis[v]==0){
                toposort(v,adj,vis,st);
            }
        }
        st.push(node);
    }
    public int[] shortestPath(int V, int E,int[][] edge ){
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<E;i++){
            int u = edge[i][0];
            int v = edge[i][1];
            int wt = edge[i][2];
            adj.get(u).add(new pair(v,wt));
        }

        int[] vis = new int[V];

        Stack<Integer> st = new Stack<>();
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                toposort(i,adj,vis,st);
            }
        }

        int[] dist = new int[V];
        for(int i=0;i<V;i++){
            dist[i]=(int)(1e9);
        }
        dist[0]=0;
        while(!st.isEmpty()){
            int node = st.pop();
            for(int i=0;i<adj.get(node).size();i++){
                int v = adj.get(node).get(i).first;
                int wt = adj.get(node).get(i).second;
                if(dist[node]+wt<dist[v]){
                    dist[v]=dist[node]+wt;
                }
            }

        }

        for(int i=0;i<V;i++){
            if(dist[i]==1e9){
                dist[i]=-1;
            }
        }
        return dist;
    }
    public static void main(String[] args) throws IOException {
        int n = 6, m = 7;
        int[][] edge = {{0,1,2},{0,4,1},{4,5,4},{4,2,2},{1,2,3},{2,3,6},{5,3,1}};
        ShortDAG obj = new ShortDAG();
        int res[] = obj.shortestPath(n, m, edge);
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
