package Singleton.Car;

public class Starter {
    public static void main(String[] args){
        CarSingle car = CarSingle.getInstance();
        if (car.isEnable()) {
            car.drive();
        } else {
            System.out.println("Car is Inuse");
        }

        CarSingle car2 = CarSingle.getInstance();
        if(!car2.isEnable()){
            car2.cancel();
        } else {
            System.out.println("Inuse");
        }
    }
}
