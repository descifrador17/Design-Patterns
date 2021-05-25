package com.company.Observable;

import com.company.Observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IWeatherStation {

    private List<IObserver> observers;
    private int temperature;
    private int humidity;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(IObserver o) {
        int observerIndex = observers.indexOf(o);
        if(observerIndex >= 0){
            observers.remove(observerIndex);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.updateObserver(temperature, humidity));
    }

    public void weatherChanges(int temperature, int humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}
