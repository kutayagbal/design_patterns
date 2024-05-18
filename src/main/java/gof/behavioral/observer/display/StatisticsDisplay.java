package gof.behavioral.observer.display;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import gof.behavioral.observer.subject.WeatherData;

public class StatisticsDisplay implements Display, Observer {
    private WeatherData weatherData;
    private List<Float> temperatures;

    public StatisticsDisplay(WeatherData weatherData) {
        this.temperatures = new ArrayList<>();
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        temperatures.add(weatherData.getTemperature());
        display();
    }

    @Override
    public void display() {
        final Float min = temperatures.stream().min(Comparator.naturalOrder()).get();
        final float max = temperatures.stream().max(Comparator.naturalOrder()).get();
        final float avg = temperatures.stream().reduce(Float::sum).orElse(0f) / (!temperatures.isEmpty()
                ? temperatures.size()
                : 1f);

        System.out.println("Temperature Statistics => Min: " + min + ", Max: " + max + ", Avg: " + avg);
    }

}
