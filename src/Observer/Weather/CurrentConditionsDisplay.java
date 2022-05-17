package Observer.Weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    //생성자에 weatherData의 주제 전달
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    //temp와 humidity를 저장하고 display() 호출
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("현재 상태: 온도" + temperature + "F, 습도" + humidity + "%");
    }
}
