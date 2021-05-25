package com.company.Observers;

import com.company.Observable.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class PastTempObserver implements IObserver{

    private List<Integer> tempHistory;
    private List<Integer> humidityHistory;

    public PastTempObserver(WeatherStation weatherStation) {
        this.tempHistory = new ArrayList<>();
        this.humidityHistory = new ArrayList<>();
    }

    @Override
    public void updateObserver(int temp, int humidity) {
        this.tempHistory.add(temp);
        this.humidityHistory.add(humidity);
        displayPastTemperatures();
    }

    public void displayPastTemperatures(){
        System.out.println("----------PAST WEATHER----------");
        System.out.println("Current Temperature -> "+tempHistory.subList(Math.max(tempHistory.size() -7 , 0),tempHistory.size()));
        System.out.println("Current Humidity -> "+humidityHistory.subList(Math.max(humidityHistory.size() -7 , 0),humidityHistory.size()));
    }


}
