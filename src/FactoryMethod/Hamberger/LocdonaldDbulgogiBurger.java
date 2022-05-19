package FactoryMethod.Hamberger;

public class LocdonaldDbulgogiBurger extends Hamburger {
    public LocdonaldDbulgogiBurger() {
        name = "록도날드 더블 불고기버거";
        bun = "기본 번";

        sauces.add("불고기 소스");

        patties.add("불고기패티");
        patties.add("치즈");
        patties.add("양상추");
    }
}
