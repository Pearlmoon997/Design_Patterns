package FactoryMethod.Hamburger;

public class LocdonaldBiclocBurger extends Hamburger {
    public LocdonaldBiclocBurger() {
        name = "록도날드 빅록버거";
        bun = "삼단 번";

        sauces.add("빅록 소스");

        patties.add("소고기패티");
        patties.add("양상추");
        patties.add("피클");
        patties.add("양상추");
        patties.add("치즈");
    }
}
