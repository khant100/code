package DSACCodingInt.Tree.RandomNode;

import java.util.Objects;

public class TreeNode {

    int value ;
    TreeNode left ;
    TreeNode right;

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        if(o==this){
            return true;
        }
        else if (!(o instanceof TreeNode)||o==null) {return false;}
        if (this == o) return true;
        TreeNode treeNode = (TreeNode) o;
        return value == treeNode.value && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return value;
    }

    public TreeNode(int value) {
        this.value = value;
        left=right=null;
    }




}
