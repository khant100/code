package DesignPattern.SingleTon;

public class BlockSynchronizedSingleTon {
    private static BlockSynchronizedSingleTon singleTon;

    private BlockSynchronizedSingleTon(){

    }
// this method is knoew as double check locking
    public static BlockSynchronizedSingleTon getInstance(){
        if(singleTon==null){
            synchronized (BlockSynchronizedSingleTon.class) {
                if (singleTon == null) {
                    singleTon = new BlockSynchronizedSingleTon();
                }
            }
        }
        return singleTon;

    }
}
