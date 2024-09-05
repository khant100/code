package Trees;

public class TreeNode {

    int data;
    TreeNode rightNode;

    public TreeNode(int data, TreeNode rightNode, TreeNode leftNode) {
        this.data = data;
        this.rightNode = rightNode;
        this.leftNode = leftNode;
    }

    TreeNode leftNode;
    public int heightOfTree(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftHeight = heightOfTree(node.leftNode);
        int rightHight = heightOfTree(node.rightNode);
        return Math.max(rightHight,leftHeight)+1;
    }


}
