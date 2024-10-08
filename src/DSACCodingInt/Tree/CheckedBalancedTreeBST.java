package DSACCodingInt.Tree;


import DSACCodingInt.BST;
import DSACCodingInt.TreeNode;

//Implement a function to check if the binaray tree is balanced or not
public class CheckedBalancedTreeBST {

    public TreeNode createBTree(){
        BST bst = new BST();
        bst.root=new TreeNode(10);
        bst.root.left=new  TreeNode(6);
        bst.root.right=new TreeNode(16);
        bst.root.left.left=new  TreeNode(3);
        bst.root.left.right=new  TreeNode(8);
        bst.root.right.right=new TreeNode(19);
        bst.root.right.left=new TreeNode(13);
        return bst.root;
    }
    public TreeNode createUBTree(){
        BST bst = new BST();
        bst.root=new TreeNode(10);
        bst.root.left=new  TreeNode(6);
        bst.root.right=new TreeNode(16);
        bst.root.left.left=new  TreeNode(3);
        bst.root.left.right=new  TreeNode(8);
        bst.root.right.right=new TreeNode(19);
        bst.root.right.left=new TreeNode(13);
        bst.root.right.left.right=new TreeNode(14);
        bst.root.right.left.left=new TreeNode(12);
        return bst.root;
    }

    public boolean isBalancedTree(TreeNode root){
        return isBalancedTreeH(root)==-1 ?false : true;
    }
    public int isBalancedTreeH(TreeNode root){

        if(root==null){
            return 0;
        }
        //left tree unbalanced
        int left = isBalancedTreeH(root.left);
        if(left==-1){
            return -1;
        }
        int right = isBalancedTreeH(root.right);
        if(right==-1){
            return -1;
        }

        if(Math.abs(left-right)>0){
            return -1;
        }

        return 1+Math.max(left,right);
    }

    public static void main(String args[]){

        CheckedBalancedTreeBST cs = new CheckedBalancedTreeBST();
        System.out.println(" "+cs.isBalancedTree(cs.createBTree()));
        System.out.println(" "+cs.isBalancedTreeH(cs.createBTree()));
        System.out.println(" "+cs.isBalancedTree(cs.createUBTree()));
        System.out.println(" "+cs.isBalancedTreeH(cs.createUBTree()));

    }


}
