package Observer.Weather;

public interface Observer {
    //모든 observer는 update메소드를 구현
    // temp, humidity, pressure를 인자로 받음
    public void update(float temp, float humidity, float pressure);
}
