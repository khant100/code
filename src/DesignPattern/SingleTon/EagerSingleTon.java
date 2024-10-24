package DesignPattern.SingleTon;

public class EagerSingleTon {

    private static EagerSingleTon singleTon=new EagerSingleTon();

    private EagerSingleTon(){

    }

    public static EagerSingleTon getInstance(){
        return singleTon;
    }


}
