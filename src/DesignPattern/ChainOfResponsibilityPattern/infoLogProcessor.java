package DesignPattern.ChainOfResponsibilityPattern;

public class infoLogProcessor extends LogProcessor{
    public infoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }
 public void log(int loglevel,String msg){
        if(loglevel==INFO){
            System.out.println("info : "+msg);
        }else{
            super.log(loglevel,msg);
        }
 }
}
