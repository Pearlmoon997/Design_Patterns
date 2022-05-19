package FactoryMethod.Hamberger;

public class LocdonalddCheeseBurger extends Hamburger {
    public LocdonalddCheeseBurger() {
        name = "록도날드 치즈버거";
        bun = "기본 번";

        sauces.add("머스타드");
        sauces.add("케찹");

        patties.add("소고기패티");
        patties.add("치즈");
        patties.add("피클");
    }
}
