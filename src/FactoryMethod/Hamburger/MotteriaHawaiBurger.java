package FactoryMethod.Hamburger;

public class MotteriaHawaiBurger extends Hamburger {
    public MotteriaHawaiBurger() {
        name = "못데리아 하와이버거";
        bun = "참깨 번";

        sauces.add("화이트마요 소스");
        sauces.add("갈릭 소스");

        patties.add("치킨패티");
        patties.add("소고기패티");
        patties.add("피클");
        patties.add("양상추");
        patties.add("치즈");
    }
}
