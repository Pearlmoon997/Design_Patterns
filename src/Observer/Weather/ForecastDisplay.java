package Observer.Weather;

public class ForecastDisplay implements Observer, DisplayElement{
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float bumidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if(currentPressure > lastPressure){
            System.out.println("Improving weather");
        } else if (currentPressure == lastPressure) {
            System.out.println("More or the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Cooler");
        }
    }
}
