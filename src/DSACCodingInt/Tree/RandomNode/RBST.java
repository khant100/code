package DSACCodingInt.Tree.RandomNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RBST {

    TreeNode treeNode = null;
    List<TreeNode> li = new ArrayList<>();
    private int size=0;
    public void insert(int val){
        if(treeNode==null){
            treeNode = new TreeNode(val);
            li.add(treeNode);
        }
        TreeNode curr = treeNode;
        while(true) {
            if (val < curr.value) {
                if (curr.left == null) {
                    TreeNode t = new TreeNode(val);
                    li.add(t);
                    curr.left = t;
                    return;
                } else {
                    curr = curr.left;
                }
            } else {
                if (curr.right == null) {
                    TreeNode t = new TreeNode(val);
                    li.add(t);
                    curr.right = t;
                    return;
                } else {
                    curr = curr.right;
                }
            }
        size++;
        }

    }

    public TreeNode getRandoomNode(){
        Random rand = new Random();
        if(treeNode==null){
            return null;
        }else {
            int r = rand.nextInt(li.size());
            return li.get(r);
        }
    }

    public TreeNode find(int val){
        TreeNode curr = treeNode;
        while(curr!=null) {
            if (curr.value == val) {
                return treeNode;
            }
            if (val < curr.value) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        return null;
        }
}
