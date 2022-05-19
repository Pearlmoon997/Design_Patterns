package FactoryMethod.Hamberger;

public class MotteriaShrimpBurger extends Hamburger {
    public MotteriaShrimpBurger() {
        name = "못데리아 새우버거";
        bun = "참깨 번";

        sauces.add("타르타르 소스");

        patties.add("새우패티");
        patties.add("양상추");
    }
}
