package Decorator.SportsCar;

public class SuperEngine extends Parts{
    public SuperEngine(SportsCar sportsCar) {
        this.sportsCar = sportsCar;
    }

    public String getName() {
        return sportsCar.getName() + "+ μνΌμμ§ ";
    }

    public int speed() {
        return sportsCar.speed() + 100;
    }
}
