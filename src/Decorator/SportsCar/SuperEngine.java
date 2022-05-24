package Decorator.SportsCar;

public class SuperEngine extends Parts{
    public SuperEngine(SportsCar sportsCar) {
        this.sportsCar = sportsCar;
    }

    public String getName() {
        return sportsCar.getName() + "+ 슈퍼엔진 ";
    }

    public int speed() {
        return sportsCar.speed() + 100;
    }
}
