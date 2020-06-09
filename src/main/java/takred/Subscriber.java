package takred;

public class Subscriber implements Observer {
    public String name;
    public String surname;

    public Subscriber(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void notification(String weatherForecast) {
        System.out.println(name + " " + surname + ". " + "На завтра появилась новая погодная сводка.");
        System.out.println(weatherForecast);
    }
}
