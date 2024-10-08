package DSACCodingInt.Tree;

import DSACCodingInt.BST;
import DSACCodingInt.TreeNode;

public class ValidateBinarySearchTree {
    // write a funtion to check if the tree is binary search tree or not ?

    BST bst = new BST();

    private TreeNode createBST(){

        bst.root= new TreeNode(7);
        bst.root.left=new TreeNode(4);
        bst.root.right=new TreeNode(9);
        return bst.root;
    }
    private TreeNode createBT(){

        bst.root= new TreeNode(7);
        bst.root.left=new TreeNode(4);
        bst.root.right=new TreeNode(9);
        bst.root.left.left=new TreeNode(5);
        bst.root.left.right=new TreeNode(6);
        return bst.root;
    }



    public boolean validate(TreeNode node){
        return validateBST(node,Integer.MIN_VALUE,Integer.MAX_VALUE);

    }

    public boolean validateBST(TreeNode root,int min,int max){
        if(root==null){
            return true;
        }
        if(root.Data<=min ||root.Data>max){
            return false;
        }

       return  validateBST(root.left,min,root.Data) && validateBST(root.right,root.Data,max);
    }

    public  static void main(String args[]){

        ValidateBinarySearchTree vst = new ValidateBinarySearchTree();
        System.out.println(" ->"+vst.validate(vst.createBT()));
        System.out.println(" ->"+vst.validate(vst.createBST()));

    }


}
