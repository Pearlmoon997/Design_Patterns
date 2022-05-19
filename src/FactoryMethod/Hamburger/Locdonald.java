package FactoryMethod.Hamburger;

public class Locdonald extends Store{

    Hamburger createHamburger(String item) {
        if (item.equals("dbulgogi")) {
            return new LocdonaldDbulgogiBurger();
        } else if (item.equals("dcheese")) {
            return new LocdonalddCheeseBurger();
        } else if (item.equals("bicloc")) {
            return new LocdonaldBiclocBurger();
        } else if (item.equals("mozza")) {
            return new LocdonalMozzaBurger();
        } else return null;
    }
}
