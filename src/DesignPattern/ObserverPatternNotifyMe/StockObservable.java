package DesignPattern.ObserverPatternNotifyMe;

import DesignPattern.ObserverPatternNotifyMe.observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver notificationAlertObserver);
    public void remove(NotificationAlertObserver notificationAlertObserver);

    public void notifyme();
    public void setStockCount(int stock);

    public int getStockCount();

}
