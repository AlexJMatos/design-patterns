package observer;

import observer.display.CurrentConditionsDisplay;
import observer.display.ForecastDisplay;
import observer.display.HeatIndexDisplay;
import observer.display.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        int readings = 1;
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        System.out.println("------------- READINGS " + readings + "-------------");
        weatherData.setMeasurements(80, 65, 30.4f);
        readings++;
        System.out.println("------------- READINGS " + readings + "-------------");
        weatherData.setMeasurements(82, 70, 29.2f);
        readings++;
        System.out.println("------------- READINGS " + readings + "-------------");
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
