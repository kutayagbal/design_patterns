package gof.behavioral.observer;

import gof.behavioral.observer.display.CurrentConditionsDisplay;
import gof.behavioral.observer.display.ForecastDisplay;
import gof.behavioral.observer.display.StatisticsDisplay;
import gof.behavioral.observer.subject.WeatherData;

public class ObserverTest {
    /*
     * OBSERVER: Defines a one-to-many dependency between objects so that when one
     * object changes state, all of its dependents are notified and updated
     * automatically.
     * 
     * Strive for loosely coupled designs between objects that interact.
     * 
     */
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
