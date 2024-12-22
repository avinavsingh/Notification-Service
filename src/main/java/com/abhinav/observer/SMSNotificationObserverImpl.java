package com.abhinav.observer;

import com.abhinav.observable.NotificationObservable;

public class SMSNotificationObserverImpl implements NotificationObserver{
    private NotificationObservable notificationObservable;

    public SMSNotificationObserverImpl(NotificationObservable notificationObservable){
        this.notificationObservable = notificationObservable;
    }

    @Override
    public void update() {
        System.out.println("Lastest movie is: "+ this.notificationObservable.getLatestMovie()+" updating through SMS");
    }
}
