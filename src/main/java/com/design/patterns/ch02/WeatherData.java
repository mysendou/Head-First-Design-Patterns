package com.design.patterns.ch02;

import java.util.ArrayList;

public class WeatherData  implements Subject{

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressuew;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressuew);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressuew) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressuew = pressuew;
        measurementsChanged();
    }
}
