package concept.Graph.SotertestPath;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class pair1{
    int node;
    int dis;
    pair1(int node,int dis){
        this.node=node;
        this.dis=dis;
    }
}

public class DijstraAlgo {

    public static void main(String[] args) throws IOException {
        int V = 3, E=3,S=2;
        ArrayList<Integer> node1 = new ArrayList<Integer>() {{add(1);add(1);}};
        ArrayList<Integer> node2 = new ArrayList<Integer>() {{add(2);add(6);}};
        ArrayList<Integer> node3 = new ArrayList<Integer>() {{add(2);add(3);}};
        ArrayList<Integer> node4 = new ArrayList<Integer>() {{add(0);add(1);}};
        ArrayList<Integer> node5 = new ArrayList<Integer>() {{add(1);add(3);}};
        ArrayList<Integer> node6 = new ArrayList<Integer>() {{add(0);add(6);}};

        ArrayList<ArrayList<Integer>> inter1 = new ArrayList<ArrayList<Integer>>(){
            {
                add(node1);
                add(node2);
            }
        };
        ArrayList<ArrayList<Integer>> inter2 = new ArrayList<ArrayList<Integer>>(){
            {
                add(node3);
                add(node4);
            }
        };
        ArrayList<ArrayList<Integer>> inter3 = new ArrayList<ArrayList<Integer>>(){
            {
                add(node5);
                add(node6);
            }
        };
        ArrayList<ArrayList<ArrayList<Integer>>> adj= new ArrayList<ArrayList<ArrayList<Integer>>>(){
            {
                add(inter1); // for 1st node
                add(inter2); // for 2nd node
                add(inter3); // for 3rd node
            }
        };
        //add final values of adj here.
        DijstraAlgo obj = new DijstraAlgo();
        int[] res= obj.dijkstra(V,adj,S);

        for(int i=0;i<V;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();

    }
    int[] dijkstra(int v,ArrayList<ArrayList<ArrayList<Integer>>> adj,int sor){
        int[] dist = new int[v];
        Arrays.fill(dist,(int)(1e9));
        PriorityQueue<pair1> pq = new PriorityQueue<>((x,y)->x.dis-y.dis);
        dist[sor]=0;
        pq.add(new pair1(sor,0));

        while(!pq.isEmpty()){
            int node = pq.peek().node;
            int dis = pq.peek().dis;
            pq.remove();

            for(int i=0;i<adj.get(node).size();i++){
                int adjNode = adj.get(node).get(i).get(0);
                int weight = adj.get(node).get(i).get(1);
                if(dis+weight<dist[adjNode]){
                    dist[adjNode]=dis+weight;
                    pq.add(new pair1(adjNode,dist[adjNode]));
                }
            }
        }
        return dist;
     }
}
