package Singleton.Parking;

public enum ParkingClass {
    UNIQUE_INSTANCE;
    private boolean Inuse;

    private ParkingClass() {
        Inuse = false;
    }

    public void parking(){
        Inuse = true;
        System.out.println("parking");
    }

    public void out(){
        Inuse = false;
        System.out.println("Out");
    }

    public boolean isEnable() {
        return !Inuse;
    }
}
