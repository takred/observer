package takred;

import java.util.ArrayList;
import java.util.List;

public class WeatherForecastSite implements Observed {
    public String weatherForecast = "";

    public List<Observer> subscribers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < subscribers.size(); i++) {
            subscribers.get(i).notification(weatherForecast);
        }
    }

    public void removeWeatherForecast(String weatherForecast) {
        this.weatherForecast = weatherForecast;
        notifyObservers();
    }
}
