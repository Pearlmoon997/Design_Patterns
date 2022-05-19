package FactoryMethod.Hamburger;

public class Motteria extends Store{

    Hamburger createHamburger(String item) {
        if (item.equals("bulgogi")){
            return new MotteriaBulgogiBurger();
        } else if (item.equals("cheese")) {
            return new MotteriaCheeseBurger();
        } else if (item.equals("hawai")) {
            return new MotteriaHawaiBurger();
        } else if (item.equals("shrimp")) {
            return new MotteriaShrimpBurger();
        } else return null;
    }
}
