package FactoryMethod.Hamberger;

public abstract class Store {
    abstract Hamburger createHamburger(String item);

    public Hamburger orderHamburger(String type){
        Hamburger hamburger = createHamburger(type);
        System.out.println("\n---" + hamburger.getName() + "---");
        hamburger.bake();
        hamburger.saucing();
        hamburger.stack();
        return hamburger;
    }
}
