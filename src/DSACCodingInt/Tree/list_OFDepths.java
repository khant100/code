package DSACCodingInt.Tree;

import DSACCodingInt.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;


// Given a binary tree design a alogorith which creates a linked list of all the nodes at each depth
// id you have tree with hight h you will have h linked list
public class list_OFDepths {

    public List<List<Integer>> listOfDept(TreeNode node) {
        List<List<Integer>> lists = new ArrayList<>();
        if(node==null){
            return lists;
        }
        ArrayDeque<TreeNode> arr = new ArrayDeque<>();
        arr.add(node);
        while(!arr.isEmpty()){
            int size = arr.size();
            ArrayList level = new ArrayList(size);
                    for(int i=0;i<size;i++){
                        TreeNode n = arr.remove();
                        level.add(n.Data);
                        if(n.left!=null){
                            arr.add(n.left);
                        }
                        if (n.right!=null){
                            arr.add(n.right);
                        }
                    }
        lists.add(level);
        }
return lists;
    }

public static void main(String args[]){

        BSTpreOrderTraversal bs = new BSTpreOrderTraversal();
        list_OFDepths ls = new list_OFDepths();
       ls.listOfDept(bs.createBST()).stream().forEach(x->System.out.println(x));


    }


}
