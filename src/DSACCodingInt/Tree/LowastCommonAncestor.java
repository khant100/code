package DSACCodingInt.Tree;

import DSACCodingInt.BST;
import DSACCodingInt.TreeNode;

public class LowastCommonAncestor {


    public TreeNode LCA(TreeNode root, TreeNode a, TreeNode b){

        if(root==null){
            return null;
        }
        if(root==a){
            return a;
        }
        if(root==b){
            return b;
        }
        TreeNode right = LCA(root.right,a,b);
        TreeNode left = LCA(root.left,a,b);
        if(right==null){
            return left;
        }
        if(left==null){
            return right;
        }

        return root;
    }

public static void main(String args[]){
    BST bst = new BST();
    bst.root=new TreeNode(5);
    bst.root.right=new TreeNode(8);
    bst.root.left=new TreeNode(2);
    bst.root.left.right=new TreeNode(4);
    bst.root.left.left=new TreeNode(1);
    bst.root.right.right=new TreeNode(10);
    bst.root.right.right.right=new TreeNode(12);
    LowastCommonAncestor lsa = new LowastCommonAncestor();
    System.out.println("->"+lsa.LCA(bst.root,bst.root.right.right.right,bst.root.right.right).Data);
    System.out.println("->"+lsa.LCA(bst.root,bst.root.right.right.right,bst.root.left.left).Data);
    System.out.println("->"+lsa.LCA(bst.root,bst.root,bst.root).Data);

}

}
