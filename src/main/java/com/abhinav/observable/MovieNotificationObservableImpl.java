package com.abhinav.observable;

import com.abhinav.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class MovieNotificationObservableImpl implements NotificationObservable{
    private String latestMovie;
    List<NotificationObserver> observers = new ArrayList<>();

    @Override
    public void add(NotificationObserver notificationObserver) {
        observers.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        observers.remove(notificationObserver);
    }

    @Override
    public void notifyObservers() {
        for(NotificationObserver observer: observers) {
            observer.update();
        }
    }

    public void setLatestMovie(String latestMovie) {
        String previousMovie = this.latestMovie;
        this.latestMovie=latestMovie;
        if(previousMovie == null || !previousMovie.equals(latestMovie)) {
            this.notifyObservers();
        }
    }

    public String getLatestMovie(){
        return this.latestMovie;
    }
}
