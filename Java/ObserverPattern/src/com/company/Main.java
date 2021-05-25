package com.company;

import com.company.Observable.WeatherStation;
import com.company.Observers.CurrentTempObserver;
import com.company.Observers.PastTempObserver;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here

        WeatherStation weatherStation = new WeatherStation();

        CurrentTempObserver currentTempObserver = new CurrentTempObserver(weatherStation);
        PastTempObserver pastTempObserver = new PastTempObserver(weatherStation);

        for (int i = 0; i < 5; i++) {
            System.out.println("## Update "+i);

            int randomTemp = getRandomInt(-40, 40);
            int randomHumidity = getRandomInt(0, 100);

            weatherStation.weatherChanges(randomTemp, randomHumidity);

            Thread.sleep(1000);
        }

    }

    private static int getRandomInt(int min, int max){
        Random rand = new Random();
        return rand.nextInt(max+1-min)+min;
    }
}
