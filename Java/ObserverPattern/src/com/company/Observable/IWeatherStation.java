package com.company.Observable;

import com.company.Observers.IObserver;

public interface IWeatherStation {
    void registerObserver(IObserver o);

    void unregisterObserver(IObserver o);

    void notifyObservers();
}
