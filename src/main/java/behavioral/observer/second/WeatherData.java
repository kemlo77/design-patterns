package behavioral.observer.second;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

  private float temperature;
  private float humidity;
  private float pressure;
  private List<Observer> observers;

  public WeatherData() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer observer) {
    this.observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    this.observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    this.observers.forEach(Observer::update);
  }

  public void meassurementsChanged() {
    notifyObservers();
  }

  public void setMeassurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    meassurementsChanged();
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }
}
