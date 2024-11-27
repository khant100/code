package concept.SlidingWindow;


//You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array of arr[], where arr[i]  is the type of fruit the ith tree produces.
//        You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow :
//
//        You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
//        Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of the baskets.
//        Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
//        Given the integer array of fruits, return the maximum number of fruits you can pick.
public class FruitBasket {

    private int numOfTrees(int[] arr){
        int basket1=arr[0];
        int basket2=0;
        int count1=0;
        int count2=0;
        int numOfTrees=0;
        int right=0;
        int left=0;

        while(right<arr.length){
            if(basket2==0&&arr[right]!=basket1){
                basket2=arr[right];
            }
            if(arr[right]==basket1){
                count1++;
            }
            if(arr[right]==basket2){
                count2++;
            }

            if(basket2!=0){
                if(arr[right]!=basket1){
                    if(arr[right]!=basket2){
                        while(arr[left]!=basket1){
                            left++;
                        }
                        basket1=basket2;
                        count1=count2;
                        basket2=arr[right];
                        count2=1;
                    }
                }

            }
            right++;
            numOfTrees=Math.max(numOfTrees,count1+count2);
        }
        return numOfTrees;
    }

    private int numOfTrees1(int[] arr){
        int basket1=arr[0];
        int basket2=0;
        int count1=0;
        int count2=0;
        int numOfTrees=0;


        for(int i=0;i<arr.length;i++){
            if(arr[i]==basket1){
                count1++;
            } else if (basket2==0&&arr[i]!=basket1) {
                basket2=arr[i];
                count2=1;
            } else if (arr[i]==basket2) {
                count2++;
            }else{
                basket1=basket2;
                count1=count2;
                basket2=arr[i];
                count2=1;
            }
        numOfTrees=Math.max(numOfTrees,count1+count2);
        }
        return numOfTrees;

    }
    public static void main(String args[]){
        int[] arr ={2, 1, 2};
        int[] arr2={3, 1, 2, 2, 2, 2};
        FruitBasket f = new FruitBasket();
        System.out.println(f.numOfTrees(arr));
        System.out.println(f.numOfTrees(arr2));

        System.out.println(f.numOfTrees1(arr));
        System.out.println(f.numOfTrees1(arr2));

    }
}
