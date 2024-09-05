package DesignPattern.ObserverPatternNotifyMe.observer;

import DesignPattern.ObserverPatternNotifyMe.StockObservable;

public class EmailAlertOserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable stockObservable;

    public EmailAlertOserverImpl(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }


    @Override
    public void update() {
         sendmail(emailId);

    }


    private void sendmail(String emailId){
        System.out.println("notified email : "+emailId);
    }
}
