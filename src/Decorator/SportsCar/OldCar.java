package Decorator.SportsCar;

public class OldCar extends SportsCar{
    public OldCar() {
        name = "오래된 스포츠카 ";
    }

    public int speed() {
        return 140;
    }
}
