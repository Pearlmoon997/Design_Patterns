package Decorator.SportsCar;

public class Drive {
    public static void main(String[] args){
        SportsCar sportsCar = new SuperCar();
        System.out.println(sportsCar.getName() + "maxSpeed= " + sportsCar.speed() + "km");

        SportsCar sportsCar1 = new GorgeousCar();
        sportsCar1 = new Wing(sportsCar1);
        sportsCar1 = new SuperEngine(sportsCar1);
        System.out.println(sportsCar1.getName() + "maxSpeed= " + sportsCar1.speed() + "km");

        SportsCar sportsCar2 = new OldCar();
        sportsCar2 = new Breaker(sportsCar2);
        System.out.println(sportsCar2.getName() + "maxSpeed= " + sportsCar2.speed() + "km");
    }
}
