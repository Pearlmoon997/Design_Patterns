package Builder.Vacation;

public class CityVacationBuilder extends VacationBuilder{
    public CityVacationBuilder() {
        this.name = "City Vacation Builder";
    }
    public VacationBuilder addAccommodation() {
        this.accommodations.add(new Hotel());
        return this;
    }
    public VacationBuilder addAccommodation(String name){
        this.accommodations.add(new Hotel(name));
        return this;
    }
    public VacationBuilder addAccommodation(String name, int year, int month, int day, int nights, int location) {
        Reservation reservation = new Reservation();
        reservation.setArrivalDate(year, month, day);
        reservation.setNights(nights);
        return this;
    }
    public VacationBuilder addEvent(String event) {
        this.events.add("See the" + event + "show");
        return this;
    }

}
