package com.design.patterns.ch02;

public class WeatherStation {
    public static void main(String[] args) {
        //创建一个主题
        WeatherData weatherData = new WeatherData();
        //创建一个监听者，并将其加入到一个主题中
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        //TODO 这里可创建其他的监听者并将其注入到 WeatherData 主题中

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.4f);
        weatherData.setMeasurements(78, 90, 29.4f);

    }
}
