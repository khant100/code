package DSACCodingInt.Tree.RandomNode;

public class RandomNode {
    public static void main(String args[]){
        RBST bst = new RBST();
        int[] array = { 1, 0, 6, 2, 3, 11, 4, 5, 8, 7,88,33};
        for (int num : array) {
            bst.insert(num);
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(bst.getRandoomNode() + " ");
        }
    }
}
