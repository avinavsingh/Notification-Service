package com.abhinav;

import com.abhinav.observable.MovieNotificationObservableImpl;
import com.abhinav.observable.NotificationObservable;
import com.abhinav.observer.EmailNotificationObserverImpl;
import com.abhinav.observer.NotificationObserver;
import com.abhinav.observer.SMSNotificationObserverImpl;

public class NotificationService {
    public static void main(String[] args) {
        NotificationObservable movieNotificationObservable = new MovieNotificationObservableImpl();
        NotificationObserver emailNotificationObserver = new EmailNotificationObserverImpl(movieNotificationObservable);
        NotificationObserver smsNotificationObserver = new SMSNotificationObserverImpl(movieNotificationObservable);

        movieNotificationObservable.add(emailNotificationObserver);
        movieNotificationObservable.add(smsNotificationObserver);
        movieNotificationObservable.setLatestMovie("SOTY");
        movieNotificationObservable.setLatestMovie("SOTY2");
    }
}
