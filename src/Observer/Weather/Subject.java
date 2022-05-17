package Observer.Weather;

public interface Subject {
    //Observer를 인자로 받아, remove 및 register 수행
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);

    //Subject변경 시 모든 옵저버에게 변경내용을 알리기위해 호출
    public void notifyObservers();
}
