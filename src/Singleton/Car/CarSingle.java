package Singleton.Car;

public class CarSingle {
    private boolean Inuse;
    private static CarSingle uniqueInstance;

    private CarSingle() {
        Inuse = false;
    }

    public static CarSingle getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new CarSingle();
        }
        return uniqueInstance;
    }

    public void drive(){
            Inuse = true;
            System.out.println("Driving");
    }

    public void cancel() {
            Inuse = false;
            System.out.println("Stop Driving");
    }

    public boolean isEnable() {
        return !Inuse;
    }
}
