package FactoryMethod.Hamburger;

public class LocdonalMozzaBurger extends Hamburger {
    public LocdonalMozzaBurger() {
        name = "록도날드 모짜버거";
        bun = "참깨 번";

        sauces.add("모짜 소스");
        sauces.add("칠리 소스");

        patties.add("치킨패티");
        patties.add("모짜렐라 치즈");
        patties.add("양상추");
    }
}
