package DSACCodingInt.Tree;

import DSACCodingInt.BST;
import DSACCodingInt.TreeNode;

import java.util.LinkedList;

public class BST_Sequence {
    // Given a binary search  tree with distinct elements
    // print all possible arry that could led to this tree


    public LinkedList<LinkedList<Integer>> sequence(TreeNode root){
    LinkedList<LinkedList<Integer>> result = new LinkedList<>();

    if(root==null){
         result.add(new LinkedList<Integer>());
         return result;
    }

    LinkedList<Integer> start = new LinkedList<>();
    start.add(root.Data);

   LinkedList <LinkedList<Integer>> left = sequence(root.left);
    LinkedList<LinkedList<Integer>> right = sequence(root.right);

    for( LinkedList<Integer> l :left){
        for(LinkedList<Integer> r :right){
            combine(result,l,r,start);
        }
    }

    return result;

    }

    private void combine(LinkedList<LinkedList<Integer>> result,LinkedList<Integer> left,
                         LinkedList<Integer> right,LinkedList<Integer> start){

        if(left.isEmpty()||right.isEmpty()){
            LinkedList<Integer> ans = new LinkedList<>(start);
            ans.addAll(left);
            ans.addAll(right);
            result.add(ans);
            return;
        }

        Integer temp =left.removeFirst();
        start.addLast(temp);
        combine(result,left,right,start);
        start.removeLast();
        left.addFirst(temp);

        Integer temp1 =right.removeFirst();
        start.addLast(temp1);
        combine(result,left,right,start);
        start.removeLast();
        right.addFirst(temp1);
    }

public static void main(String args[]){
        BST_Sequence bst = new BST_Sequence();
    BST b = new BST();
    b.root=new TreeNode(9);
    b.root.left =new TreeNode(3);
    b.root.right = new TreeNode(15);
    b.root.left.left=new TreeNode(1);
    b.root.left.right=new TreeNode(5);
    b.root.right.right=new TreeNode(20);

        bst.sequence(b.root).stream().forEach(x->System.out.println("-"+x));
}
}
