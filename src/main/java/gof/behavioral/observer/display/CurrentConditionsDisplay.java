package gof.behavioral.observer.display;

import gof.behavioral.observer.weather.WeatherData;

public class CurrentConditionsDisplay implements Display, Observer {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions => Temperature: " + temperature + ", Humidity: " + humidity);
    }

}
