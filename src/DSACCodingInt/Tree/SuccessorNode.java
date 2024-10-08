package DSACCodingInt.Tree;

import DSACCodingInt.BST;
import DSACCodingInt.TreeNode;

public class SuccessorNode {

    //Write a algorithm to find next node of a given node in binary search tree
    // each node has link to its parent

public TreeNode inorderSuccesor(TreeNode node){
    if(node.right!=null){
        return leftMostChild(node.right);
    }else{
        if(node==null){
            return null;
        }
    TreeNode parent = node.parent;
        TreeNode child = node;
        while(parent!=null && parent.left!=child){
            child=parent;
            parent= child.parent;
        }
    return parent;
    }



}

private TreeNode leftMostChild(TreeNode node) {
    if (node == null) {
        return null;
    }
    TreeNode curr = node;
    while (curr.left != null) {
        curr=curr.left;
    }
    return curr;
}

    public static void main(String args[]){

    SuccessorNode sc = new SuccessorNode();

    BST bst = new BST();
    bst.root = new TreeNode(10);
    bst.root.addLeftChild(6);
    bst.root.addRightChild(16);
    bst.root.left.addLeftChild(4);
    bst.root.left.addRightChild(8);
    bst.root.right.addRightChild(18);
    bst.root.right.addLeftChild(14);
        TreeNode root = new TreeNode(5);
        root.addLeftChild(1);
        root.left.addLeftChild(0);
        root.addRightChild(8);
        root.right.addLeftChild(6);
        root.right.addRightChild(9);

   System.out.println( sc.inorderSuccesor(bst.root).Data);
   System.out.println( sc.inorderSuccesor(bst.root.left.left).Data);
    System.out.println(sc.inorderSuccesor(bst.root.right).Data);

        System.out.println( sc.inorderSuccesor(root).Data);
        System.out.println( sc.inorderSuccesor(root.left).Data);
        System.out.println(sc.inorderSuccesor(root.right.right));





    }
}
