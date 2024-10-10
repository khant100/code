package DSACCodingInt.Tree;

import java.util.LinkedList;

/**
 * 4.1 - Route Between Nodes
 * BFS
 * Given a directed graph, design an algorithm
 * to find out whether there is a route between two nodes
 */

public class RouteBetweenNodes {

    public boolean rootbetween(GraphNode start,GraphNode end){
        if(start==null){
            return true;
        }

        LinkedList<GraphNode> lk = new LinkedList();
        start.visit();
        lk.add(start);


        while(!lk.isEmpty()){
            GraphNode cs = lk.remove();
            if(cs==end){
                return true;
            }
            for(GraphNode graphNode : cs.getNeigbour()){
                if(!graphNode.visited){
                    graphNode.visit();
                    lk.add(graphNode);
                }
            }

        }
return false;


    }

    public static void main(String args[]){


        GraphNode g1 = new GraphNode(2);
        GraphNode g2 = new GraphNode(3);
        GraphNode g3 = new GraphNode(5);
        GraphNode g4 = new GraphNode(66);

        RouteBetweenNodes r = new RouteBetweenNodes();
        System.out.println(r.rootbetween(g1,g2));
        g1.addNeightbour(g2);
        g1.addNeightbour(g3);
        System.out.println(r.rootbetween(g1,g2));
        System.out.println(r.rootbetween(g1,g4));
        g1.addNeightbour(g4);
        System.out.println(r.rootbetween(g1,g4));


    }

    // given a directed graph design a algorithmto find out weather there is route between 2 nodes
}
