package DSACCodingInt;

public class TreeNode {

   public  int Data;
     public TreeNode left ;
    public TreeNode right;
    public TreeNode parent;

    public TreeNode(int data) {
        Data = data;
        left=right=parent=null;
    }

    public void addLeftChild(int data) {
        TreeNode treeNode = new TreeNode(data);
        left=treeNode;
        left.parent=this;
    }

    public void addRightChild(int data) {
        TreeNode treeNode = new TreeNode(data);
        right=treeNode;
        right.parent=this;

    }
}
