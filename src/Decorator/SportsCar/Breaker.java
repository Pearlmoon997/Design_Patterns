package Decorator.SportsCar;

public class Breaker extends Parts{

    public Breaker(SportsCar sportsCar) {
        this.sportsCar = sportsCar;
    }

    public String getName() {
        return sportsCar.getName() + "+ 브레이크 ";
    }

    public int speed() {
        return sportsCar.speed() - 20;
    }
}
