package DSACCodingInt.Tree;

import DSACCodingInt.TreeNode;

public class CreateBSTWithMinimalHeight {

    private TreeNode createMinTree(int[] arr){

        return BST(arr , 0,arr.length-1);

    }
    private TreeNode BST(int[] arr,int st, int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = BST(arr,st,mid-1);
        root.right=BST(arr,mid+1,end);
        return root;
    }


public static void main(String args[]){
        CreateBSTWithMinimalHeight cs = new CreateBSTWithMinimalHeight();
        BSTpreOrderTraversal bs = new BSTpreOrderTraversal();
        int[] arr = {2,4,6,7,8,9,11,12,13};
       bs.printInOrder( cs.createMinTree(arr));
       System.out.println();
       bs.printpreOrder(cs.createMinTree(arr));
    System.out.println();
    bs.printPostOrder(cs.createMinTree(arr));
 }

}
