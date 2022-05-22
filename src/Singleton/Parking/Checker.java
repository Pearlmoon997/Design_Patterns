package Singleton.Parking;

public class Checker {
    public static void main(String[] args) {
        ParkingClass park = ParkingClass.UNIQUE_INSTANCE;
        if (park.isEnable()) {
            park.parking();
        } else {
            System.out.println("No space");
        }

        if (!park.isEnable()){
            park.out();
        } else {
            System.out.println("Can use");
        }
    }
}
