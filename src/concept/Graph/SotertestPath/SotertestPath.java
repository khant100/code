package concept.Graph.SotertestPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//You are given an adjacency list, adj of Undirected Graph having unit weight of the edges, find the shortest path from src to all the vertex and if it is unreachable to reach any vertex, then return -1 for that vertex.
//
//        Examples :
//
//        Input: adj[][] = [[1, 3], [0, 2], [1, 6], [0, 4], [3, 5], [4, 6], [2, 5, 7, 8], [6, 8], [7, 6]], src=0
//        Output: [0, 1, 2, 1, 2, 3, 3, 4, 4]
public class SotertestPath {

    public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        int n = adj.size();
        int[] dis = new int[n];

        Arrays.fill(dis,-1);
        Queue<Integer> queue =new LinkedList<>();
        queue.add(src);
        dis[src]=0;

        while(!queue.isEmpty()){
            int node= queue.peek();
            queue.remove();

            for(int it:adj.get(node)){
                if(dis[it]==-1){
                    dis[it]=1+dis[node];
                    queue.add(it);
                }
            }
        }
    return dis;

    }
    public static void main(String[] args) {
        int V = 9; // Number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges (undirected graph)
        adj.get(0).add(1); adj.get(1).add(0);
        adj.get(0).add(3); adj.get(3).add(0);
        adj.get(1).add(2); adj.get(2).add(1);
        adj.get(3).add(4); adj.get(4).add(3);
        adj.get(4).add(5); adj.get(5).add(4);
        adj.get(5).add(6); adj.get(6).add(5);
        adj.get(2).add(6); adj.get(6).add(2);
        adj.get(6).add(7); adj.get(7).add(6);
        adj.get(6).add(8); adj.get(8).add(6);
        adj.get(7).add(8); adj.get(8).add(7);

        SotertestPath gsp = new SotertestPath();
        int src = 0; // Starting node
        int[] result = gsp.shortestPath(adj, src);

        System.out.println("Shortest paths from node " + src + ": " + Arrays.toString(result));
    }
}
