package Builder.Vacation;

public abstract class Accommodation {
    String name;
    Reservation reservation = null;

    public void setReservation(Reservation r) {
        this.reservation = r;
    }

    //Reservation 클래스의 도착 일, 숙박 일 을 받아옴
    public Reservation getReservation() {
        return this.reservation;
    }
    public abstract String getLocation();

}
