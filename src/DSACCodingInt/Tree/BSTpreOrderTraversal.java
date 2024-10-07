package DSACCodingInt.Tree;

import DSACCodingInt.BST;
import DSACCodingInt.TreeNode;
import JavaConcept.ArrayDeQueue;

import java.util.ArrayDeque;

public class BSTpreOrderTraversal {


    public TreeNode createBST(){
        BST bst = new BST();
        bst.root = new TreeNode(5);
        bst.root.left = new TreeNode(3);
        bst.root.right = new TreeNode(7);
        bst.root.right.right = new TreeNode(9);
        bst.root.right.left = new TreeNode(6);
        return bst.root;
    }
    public void printpreOrder(TreeNode node) {

        if (node!=null) {
            System.out.print(" "+node.Data);
            printpreOrder(node.left);
            printpreOrder(node.right);

        }
    }
    public void printInOrder(TreeNode node) {

        if (node!=null) {

            printInOrder(node.left);
            System.out.print(" "+node.Data);
            printInOrder(node.right);

        }
    }

    public void printPostOrder(TreeNode node) {

        if (node!=null) {

            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print(" "+node.Data);

        }
    }

    public void levelOrderTraversal(TreeNode node ){

        ArrayDeque<TreeNode> a = new ArrayDeque();
        a.add(node);
        while (!a.isEmpty()){
            TreeNode n = a.removeFirst();
            System.out.print(" "+n.Data);
            if(n.left!=null){
                a.addLast(n.left);
            }
            if(n.right!=null){
                a.addLast(n.right);
            }
        }



    }


    public static void main(String args[]){
        BSTpreOrderTraversal bsTpreOrderTraversal = new BSTpreOrderTraversal();
        System.out.println("Printing preOrder ");
        bsTpreOrderTraversal.printpreOrder(bsTpreOrderTraversal.createBST());
        System.out.println();
        System.out.println("Printing InOrder ");
        bsTpreOrderTraversal.printInOrder(bsTpreOrderTraversal.createBST());
        System.out.println();
        System.out.println("Printing PostOrder ");
        bsTpreOrderTraversal.printPostOrder(bsTpreOrderTraversal.createBST());
        System.out.println();
        System.out.println("printing Level Order Traversal");
        bsTpreOrderTraversal.levelOrderTraversal(bsTpreOrderTraversal.createBST());


    }
}






