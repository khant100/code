package DSACCodingInt.Tree.BuildOrder;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 4.7 Build Order - solution 1
 * You are given a list of projects and a list of dependencies
 * (which is a list of pairs of projects, where the 1st project is
 * dependent on the 2nd project. All of a project's dependencies
 * must be built before the project is. Find a build order that will allow
 * the projects to be built.
 * If there is no valid build order, return an error
 * Example :
 * 		INPUT
 *			projects : a, b, c, d, e, f
 * 			dependencies : (d,a), (b,f), (d,b), (a,f), (c,d)
 *		OUTPUT : f, e, a b, d, c
 */

public class BuildOrder {

    public Deque<Node> topSort(String[] source, String[][] dependence) throws Exception {
        Graph graph = new Graph();

        for(String s :source){
            graph.addNode(s);
        }
        for(String[] dependency : dependence){
            String sc =dependency[0];
            String des = dependency[1];
            graph.addDirectedEdge(sc,des);
        }
        return toposort(graph);
    }

public Deque<Node> toposort(Graph graph) throws Exception {
        Node source = new Node("Source");
        for(Node node :graph.nodes ){
            source.addDirctedNeighbout(node);
        }
Deque<Node> result = new ArrayDeque<>();
        Dfssort(source,result);
        result.removeFirst();
        return result;
    }
public void Dfssort(Node node,Deque result) throws Exception {
        node.visited=Visited.Active;
        for(Node n :node.neghbour){
            if(n.visited==Visited.New){
                Dfssort(n,result);
            } else if (n.visited==Visited.Active) {
                throw new Exception("Graph is not Acyclic");
            }
        }
    node.visited = Visited.Done;
        result.addFirst(node);
}

    public static void main(String[] args) throws Exception {
        System.out.println("*** Test 4.7: Build Order\n");

        String[] projects = {"a", "b", "c", "d", "e", "f"};
        String[][] dependencies = {
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "c"}
        };
    BuildOrder buildOrder = new BuildOrder();
    buildOrder.topSort(projects,dependencies).stream().forEach(x->System.out.println("->"+x));
    }
}
