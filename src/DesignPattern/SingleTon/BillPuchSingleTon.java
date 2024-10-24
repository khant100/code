package DesignPattern.SingleTon;

public class BillPuchSingleTon {


    private BillPuchSingleTon(){

    }

    private static class InnerClass{
        private static final BillPuchSingleTon singleTon= new BillPuchSingleTon();
    }
public static BillPuchSingleTon getInstance(){
        return InnerClass.singleTon;
}
}
