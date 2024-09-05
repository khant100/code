package DesignPattern.ObserverPatternNotifyMe;

import DesignPattern.ObserverPatternNotifyMe.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObserverImpl implements StockObservable{
    public List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();

    public int stockcount=0;
    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.remove(notificationAlertObserver);
    }

    @Override
    public void notifyme() {
        for (NotificationAlertObserver notificationAlertObserver1 : notificationAlertObserverList){
            notificationAlertObserver1.update();
        }

    }

    @Override
    public void setStockCount(int newstockadded) {
        stockcount = stockcount+newstockadded;
        if(stockcount<9){
            notifyme();
        }

    }

    @Override
    public int getStockCount() {
        return 0;
    }
}
