package DesignPattern.SingleTon;

public class LazySingleTon {

    private static LazySingleTon singleTon;

    private LazySingleTon(){

    }

    public static LazySingleTon getInstance(){
        if(singleTon==null){
            singleTon=new LazySingleTon();
        }
        return singleTon;
    }
}
