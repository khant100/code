package DSACCodingInt.Tree.BuildOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph {

    ArrayList<Node> nodes = new ArrayList<>();
    Map<String,Node> map = new HashMap<>();

    public void addDirectedEdge(String s1, String s2){
        Node source = map.get(s1);
        Node distination = map.get(s2);
        source.addDirctedNeighbout(distination);
    }

    public void addNode(String s1){
        Node node = new Node(s1);
        nodes.add(node);
        map.put(s1,node);
    }


}
