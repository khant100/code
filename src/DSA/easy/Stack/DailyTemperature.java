package DSA.easy.Stack;

import java.util.Stack;
//73,74,75,71,69,72,76,73};
public class DailyTemperature { public int[] dailyTemperatures(int[] temperatures) {
    int[] arr = new int[temperatures.length];

    Stack<Integer> s = new Stack<>();
    for(int i=0;i<temperatures.length;i++){

        while(!s.isEmpty()&&temperatures[s.peek()]<temperatures[i]){
            System.out.println(s.peek()+" "+temperatures[s.peek()]+" k"+temperatures[i]+" "+i);
            int k=s.pop();
            arr[k] = i-k;
            //System.out.println(k+" k"+arr[k]);
        }
        s.push(i);

    }

    return arr;
}

    public static void main(String args[]){
DailyTemperature dailyTemperature = new DailyTemperature();
    int[] num = {73,74,75,71,69,72,76,73};
        int[] nu1 = {30,40,50,60};
        int[] num2 = {30,60,90};
        System.out.println(" "+dailyTemperature.dailyTemperatures(num));
    }

}
