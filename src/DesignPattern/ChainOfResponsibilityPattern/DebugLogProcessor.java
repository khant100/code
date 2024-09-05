package DesignPattern.ChainOfResponsibilityPattern;

public class DebugLogProcessor  extends LogProcessor{
    public DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }
    public void log(int loglevel,String msg){
        if(loglevel==DEBUG){
            System.out.println("Debug : "+msg);
        }else{
            super.log(loglevel,msg);
        }
    }
}
