package behavioral.observer.second;

public class WeatherStation {

  public static void main(String[] args) {

    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);


    weatherData.setMeassurements(25,89.0f, 23.2f);

    HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
    weatherData.setMeassurements(23,90.0f, 23.1f);

    weatherData.removeObserver(heatIndexDisplay);
    weatherData.setMeassurements(22,90.1f, 23.0f);
  }

}
