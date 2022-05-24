package Decorator.SportsCar;

public abstract class SportsCar {
    String name = "없음";

    public String getName() {
        return name;
    }

    public abstract int speed();
}
