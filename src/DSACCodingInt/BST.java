package DSACCodingInt;

public class BST {
    public TreeNode root;

    public void BSTTraversal(TreeNode node){
        if(node!=null){
            BSTTraversal(node.left);
            System.out.print(" "+node.Data);
            BSTTraversal(node.right);

        }
    }

public  static  void main(String args[]){
            BST bst = new BST();
          bst.root= new TreeNode(2);
          bst.root.left=new TreeNode(1);
          bst.root.right=new TreeNode(4);
          bst.root.left.left=new TreeNode(-1);
          bst.BSTTraversal(bst.root);
}

}
