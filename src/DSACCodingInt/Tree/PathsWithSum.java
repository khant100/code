package DSACCodingInt.Tree;

import DSACCodingInt.BST;
import DSACCodingInt.TreeNode;

/**
 *
 * Problem: You are implementing a binary search tree class from scratch, which,
 * in addition to insert, find, and delete, has a method getRandomNode() which
 * returns a random node from the tree. All nodes should be equally likely to be
 * chosen. Design and implement an algorithm for getRandomNode, and explain how
 * you would implement the rest of the methods.
 *
 * Time Complexity: O(logN), where N is the number of nodes.
 *
 */

public class PathsWithSum {

    public int countPathWithSums(TreeNode root,int target){
        if(root==null){
            return 0;
        }
        int fromroot = countsum(root,target,0);
        int fromleft = countPathWithSums(root.left,target);
        int fromRight = countPathWithSums(root.right,target);
        return fromleft+fromRight+fromroot;
    }


    private int countsum(TreeNode root,int target,int currentsum){
       int totalpath =0;
        if(root==null){
            return totalpath;
        }
        currentsum+=root.Data;
        if(currentsum==target){
            totalpath++;
        }

        totalpath+=countsum(root.left,target,currentsum);
        totalpath+=countsum(root.right,target,currentsum);
        return totalpath;
    }

    public static void main(String args[]){

        BST bst = new BST();
        bst.root = new TreeNode(5);
        bst.root.left = new TreeNode(1);
        bst.root.left.left = new TreeNode(0);
        bst.root.right= new TreeNode(8);
        bst.root.right.left = new TreeNode(6);
        bst.root.right.right = new TreeNode(9);
        PathsWithSum ps = new PathsWithSum();
        System.out.println(ps.countPathWithSums(bst.root,6));


    }

}


