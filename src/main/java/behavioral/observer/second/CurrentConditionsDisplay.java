package behavioral.observer.second;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

  private WeatherData weatherData;
  private float temperature;
  private float humidity;

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
    System.out.println("Current temp: " + this.temperature + " degrees and humidity: " + this.humidity + " %");
  }
}
