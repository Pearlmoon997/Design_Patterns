package Decorator.SportsCar;

public class Wing extends Parts{

    public Wing(SportsCar sportsCar) {
        this.sportsCar = sportsCar;
    }

    public String getName(){
        return sportsCar.getName() + "+ 윙 ";
    }

    public int speed() {
        return sportsCar.speed() + 20;
    }
}
