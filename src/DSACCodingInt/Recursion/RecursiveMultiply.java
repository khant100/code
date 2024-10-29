package DSACCodingInt.Recursion;

public class RecursiveMultiply {


    public int mulplyAdd(int x,int y){
        if(x==0||y==0){
            return 0;
        }
        else if (x==1){
            return y;
        }

        return y+mulplyAdd(x-1,y);
    }
    public int multiple(int x, int y){
        if(x<=y){
         return  mulplyAdd(x,y);}
        else{
         return  mulplyAdd(y,x);
        }
        }





public static void main(String args[]){
        RecursiveMultiply rs = new RecursiveMultiply();
        int x=20;
        int y=15;
        System.out.println("multiple of "+x+" and "+y+" is "+rs.multiple(x,y));

}



}
