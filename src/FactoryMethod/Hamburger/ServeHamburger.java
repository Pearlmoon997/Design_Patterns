package FactoryMethod.Hamburger;

public class ServeHamburger {

    public static void main(String[] args){
        Store Motteria = new Motteria();
        Store Locdonald = new Locdonald();

        Hamburger hamburger = Motteria.orderHamburger("bulgogi");

        hamburger = Motteria.orderHamburger("hawai");

        hamburger = Locdonald.orderHamburger("mozza");

        hamburger = Locdonald.orderHamburger("bicloc");
    }
}
