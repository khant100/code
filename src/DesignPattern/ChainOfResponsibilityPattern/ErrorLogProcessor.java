package DesignPattern.ChainOfResponsibilityPattern;

public class ErrorLogProcessor  extends LogProcessor{
    public ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }
    public void log(int loglevel,String msg){
        if(loglevel==ERROR){
            System.out.println("Error : "+msg);
        }else{
            super.log(loglevel,msg);
        }
    }
}
