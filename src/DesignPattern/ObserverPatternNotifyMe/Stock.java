package DesignPattern.ObserverPatternNotifyMe;

import DesignPattern.ObserverPatternNotifyMe.observer.EmailAlertOserverImpl;
import DesignPattern.ObserverPatternNotifyMe.observer.MobileAlertOserverImpl;
import DesignPattern.ObserverPatternNotifyMe.observer.NotificationAlertObserver;

public class Stock {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        StockObservable stockObservable = new IphoneObserverImpl();
        NotificationAlertObserver notificationAlertObserver = new EmailAlertOserverImpl("abc@gmail.com",stockObservable);

        NotificationAlertObserver notificationAlertObserver1 = new EmailAlertOserverImpl("abcd@gmail.com",stockObservable);

        NotificationAlertObserver notificationAlertObserver2 = new MobileAlertOserverImpl("xyz1234",stockObservable);

        stockObservable.add(notificationAlertObserver);
        stockObservable.add(notificationAlertObserver1);
        stockObservable.add(notificationAlertObserver2);
        stockObservable.setStockCount(10);
     stockObservable.setStockCount(-5);
       stockObservable.setStockCount(-5);
       // stockObservable.setStockCount(-10);
//        stockObservable.setStockCount(0);

    }
}
