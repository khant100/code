package concept.Graph;

import DSACCodingInt.Stack.ImplementMinStack;

import java.util.*;

public class EventualSafeSpaceBFS {

    static List<Integer> bfs(List<List<Integer>> adj){
        int n = adj.size();
        List<List<Integer>> rev=new ArrayList<>();
        for(int i=0;i<n;i++){
            rev.add(new ArrayList<>());
        }
        int[] indegree = new int[n];
        for(int i=0;i<n;i++){
            for(Integer it :adj.get(i)){
                rev.get(it).add(i);
                indegree[i]++;
            }
        }

        List<Integer> safe = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0;i<n;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        while (!queue.isEmpty()){
            int node =queue.peek();
            queue.remove();
            safe.add(node);

            for(Integer it : rev.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    queue.add(it);
                }
            }

        }
         Collections.sort(safe);
        return safe;
    }
    public static void main(String[] args) {
        int V = 12;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(2).add(4);
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
        bfs(adj).stream().forEach(x->System.out.print("-"+x));

    }
    }
