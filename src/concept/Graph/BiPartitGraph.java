package concept.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BiPartitGraph {
//    There is an undirected graph with n nodes, where each node is numbered between 0 and n - 1. You are given a 2D array graph, where graph[u] is an array of nodes that node u is adjacent to. More formally, for each v in graph[u], there is an undirected edge between node u and node v. The graph has the following properties:
//
//    There are no self-edges (graph[u] does not contain u).
//    There are no parallel edges (graph[u] does not contain duplicate values).
//    If v is in graph[u], then u is in graph[v] (the graph is undirected).
//    The graph may not be connected, meaning there may be two nodes u and v such that there is no path between them.
//    A graph is bipartite if the nodes can be partitioned into two independent sets A and B such that every edge in the graph connects a node in set A and a node in set B.
//
 //   Input: graph = [[1,2,3],[0,2],[0,1,3],[0,2]]
   // Output: false

    public static boolean isBiparte(int[][] gr){
        int n = gr.length;
        int[] colour = new int[n];

        for (int node = 0; node < n; node++) {
            if (colour[node] == 0) {
                Queue<Integer> q = new LinkedList<>();
                q.add(node);
                colour[node] = 1;
                while (!q.isEmpty()) {
                    int cur = q.peek();
                    q.remove();
                    for (int ne : gr[cur]) {
                        if (colour[ne] == 0) {
                            colour[ne] = -colour[cur];
                            q.add(ne);
                        } else if (colour[ne] != -colour[cur]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String args[]){
        int[][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
        int[][] gra = {{1,3},{0,2},{1,3},{0,2}};
        System.out.println(isBiparte(graph));
        System.out.println(isBiparte(gra));
    }
}
