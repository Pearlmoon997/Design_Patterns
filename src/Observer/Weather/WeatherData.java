package Observer.Weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    //등록 요청 시 목록에 추가
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    //제거 요청시 목록에서 제거
    public void removeObserver(Observer o){
        observers.remove(o);
    }

    //모든 옵저버에게 상태변화를 알려줌
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    //갱신된 측정값을 옵저버들에게 알림
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
