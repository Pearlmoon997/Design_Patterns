package FactoryMethod.Hamberger;

public class MotteriaCheeseBurger extends Hamburger {
    public MotteriaCheeseBurger() {
        name = "못데리아 치즈버거";
        bun = "기본번";

        sauces.add("머스타드");
        sauces.add("케찹");

        patties.add("소고기패티");
        patties.add("치즈");
        patties.add("피클");
    }
}
