package com.company.Observers;

import com.company.Observable.WeatherStation;

public class CurrentTempObserver implements IObserver{

    private int temperature;
    private int humidity;

    public CurrentTempObserver(WeatherStation weatherStation) {
        weatherStation.registerObserver(this);
    }

    @Override
    public void updateObserver(int temp, int humidity) {
        this.temperature = temp;
        this.humidity = humidity;
        displayCurrentWeather();
    }

    public void displayCurrentWeather(){
        System.out.println("----------CURRENT WEATHER----------");
        System.out.println("Current Temperature -> "+ this.temperature);
        System.out.println("Current Humidity -> "+ this.humidity);
        System.out.println();
    }

}
