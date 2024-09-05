package DesignPattern.ChainOfResponsibilityPattern;

public class Main {
    public static void main(String args[]){
        LogProcessor logProcessor = new infoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.DEBUG,"lets Debug it");
        logProcessor.log(LogProcessor.ERROR,"oops error has occured");
        logProcessor.log(LogProcessor.INFO,"Logging is started");
    //logProcessor.log(LogProcessor.DEBUG,"lets Debug it");
    //logProcessor.log(LogProcessor.ERROR,"oops error has occured");
    }
}
