package takred;

public class Main {
    public static void main(String[] args) {
        WeatherForecastSite weatherForecastSite = new WeatherForecastSite();
        weatherForecastSite.removeWeatherForecast("Ясно");

        Observer firstSub = new Subscriber("Костя", "Сазонов");
        Observer secondSub = new Subscriber("Илья", "Сазонов");

        weatherForecastSite.addObserver(firstSub);
        weatherForecastSite.addObserver(secondSub);

        weatherForecastSite.removeWeatherForecast("Облачно");

        weatherForecastSite.removeWeatherForecast("Дождливо");
    }
}