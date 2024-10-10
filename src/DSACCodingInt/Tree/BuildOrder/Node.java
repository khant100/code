package DSACCodingInt.Tree.BuildOrder;

import java.util.HashSet;

public class Node {
    String data;
    Visited visited;
    HashSet<Node> neghbour;

    public Node(String data) {
        this.data = data;
        visited=Visited.New;
        neghbour=new HashSet<>();
    }

public void addDirctedNeighbout(Node node){
        neghbour.add(node);
}

    @Override
    public String toString() {
        return String.valueOf(data);

    }
}

