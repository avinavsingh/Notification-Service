package com.abhinav.observer;

import com.abhinav.observable.NotificationObservable;

public class EmailNotificationObserverImpl implements NotificationObserver{
    private NotificationObservable notificationObservable;

    public EmailNotificationObserverImpl(NotificationObservable notificationObservable){
        this.notificationObservable = notificationObservable;
    }

    @Override
    public void update() {
        System.out.println("Lastest movie is: "+ this.notificationObservable.getLatestMovie()+" updating through Email");
    }
}
