package FactoryMethod.Hamburger;

public class MotteriaBulgogiBurger extends Hamburger{

    public MotteriaBulgogiBurger() {
        name = "못데리아 불고기버거";
        bun = "기본 번";

        sauces.add("불고기 소스");

        patties.add("불고기패티");
        patties.add("피클");
        patties.add("양상추");
    }
}
