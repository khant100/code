package DesignPattern.ObserverPatternNotifyMe.observer;

import DesignPattern.ObserverPatternNotifyMe.StockObservable;

public class MobileAlertOserverImpl implements NotificationAlertObserver{
    String username;
    StockObservable stockObservable;

    public MobileAlertOserverImpl(String username, StockObservable stockObservable) {
        this.username = username;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
            sendmsg(username);
    }
private void sendmsg(String usname){
        System.out.println("Message sent to user "+usname);
}
}
