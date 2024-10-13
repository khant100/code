package DSACCodingInt.Tree;

import DSACCodingInt.BST;
import DSACCodingInt.TreeNode;

public class SubtreeCheck {

    // check if the given tree is part of sb tree

    public boolean checkSubTree(TreeNode root1, TreeNode root2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        s1 = stTree(root1, s1);
        s2 = stTree(root2, s2);
        return s1.indexOf(String.valueOf(s2)) != -1;
    }

    StringBuilder stTree(TreeNode treeNode, StringBuilder s) {
        if (treeNode == null) {
            s.append("X");
            return s;
        }

        s.append(treeNode.Data);
        stTree(treeNode.left, s);
        stTree(treeNode.right, s);
        return s;

    }

    public static void main(String args[]) {
        BST b = new BST();
        BSTpreOrderTraversal bs = new BSTpreOrderTraversal();
        TreeNode root1 = bs.createBST();
        TreeNode root2 = new TreeNode(5);
        root2.right = new TreeNode(20);
        root2.left = new TreeNode(3);
        TreeNode root3 = new TreeNode(9);
        root3.right = new TreeNode(20);
        root3.left = new TreeNode(5);
        root3.right.left = new TreeNode(15);
        root3.left.left = new TreeNode(3);
        root3.left.right = new TreeNode(20);
        SubtreeCheck sc = new SubtreeCheck();

        System.out.println(sc.checkSubTree(root1, root2));
        System.out.println(sc.checkSubTree(root2, root3));
        System.out.println(sc.checkSubTree(root3, root3));
        System.out.println(sc.checkSubTree(root3, root2));
    }
}