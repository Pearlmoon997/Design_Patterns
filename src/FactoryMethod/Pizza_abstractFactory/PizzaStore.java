package FactoryMethod.Pizza_abstractFactory;

public abstract class PizzaStore {

    //접근제한자(protected)
    protected  abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("---Making a " + pizza.getName() + " ___");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
