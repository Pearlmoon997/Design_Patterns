package Builder.Vacation;

public class VacationDirector {
    public static void main(String[] args) {
        VacationBuilder city = new CityVacationBuilder();
        Vacation cityVacation = city
                .addAccommodation("Grand", 2022, 06, 05, 2, 10)
                .addAccommodation("Hayat", 2022, 06, 07, 1, 11)
                .addEvent("Musical")
                .getVacation();
        System.out.println(cityVacation);
    }
}
