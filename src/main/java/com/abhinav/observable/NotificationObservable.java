package com.abhinav.observable;

import com.abhinav.observer.NotificationObserver;

public interface NotificationObservable{
    void add(NotificationObserver notificationObserver);
    void remove(NotificationObserver notificationObserver);
    void notifyObservers();
    void setLatestMovie(String latestMovie);

    String getLatestMovie();
}
