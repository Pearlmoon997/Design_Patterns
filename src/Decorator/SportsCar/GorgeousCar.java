package Decorator.SportsCar;

public class GorgeousCar extends SportsCar{
    public GorgeousCar() {
        name = "매우 엄청난 스포츠카 ";
    }

    public int speed() {
        return 280;
    }
}
