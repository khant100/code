package concept.Greedy;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Item{
    public Item(double value, double weight) {
        this.weight = weight;
        this.value = value;
    }

    double weight;
    double value;

        }

        

public class FractionalKnapSack {




//    Problem Statement: The weight of N items and their corresponding values are given. We have to put these items in a knapsack of weight W such that the total value obtained is maximized.
//
//    Note: We can either take the item as a whole or break it into smaller units.
//
//    Example:
//
//    Input: N = 3, W = 50, values[] = {100,60,120}, weight[] = {20,10,30}.
//
//    Output: 240.00

    static class itemComparator implements Comparator<Item>
    {
        @Override
        public int compare(Item a, Item b)
        {
            double r1 = (double)(a.value) / (double)(a.weight);
            double r2 = (double)(b.value) / (double)(b.weight);
            if(r1 < r2) return 1;
            else if(r1 > r2) return -1;
            else return 0;
        }
    }
    public static double fractionalKnapsack(int w, Item[] sorted, int n){
         double leftweight =0;
        double totalVal=0;
        Arrays.sort(sorted,new itemComparator());

        for(int i=0;i<n;i++){
            if(leftweight+sorted[i].weight<w){
                leftweight+=sorted[i].weight;
                totalVal+=sorted[i].value;
            }else{
                totalVal+= ((w-leftweight)/(sorted[i].weight))*sorted[i].value;
            }
        }
        return totalVal;
    }
    public static void main(String args[])
    {
        int n = 3, weight = 50;
        Item arr[] = {new Item (100,20),new Item(60,10),new Item(120,30)};
        double ans = fractionalKnapsack(weight, arr, n);
        System.out.println("The maximum value is "+ans);
    }
}
