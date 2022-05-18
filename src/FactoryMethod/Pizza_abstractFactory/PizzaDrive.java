package FactoryMethod.Pizza_abstractFactory;

public class PizzaDrive {
    public static void main(String[] args) {
        PizzaStore ny = new NYPizzaStore();
        PizzaStore chicago = new ChicagoPizzaStore();

        Pizza pizza = ny.orderPizza("cheese");
        System.out.println("1번 주문" + pizza + "\n");

        pizza = chicago.orderPizza("cheese");
        System.out.println("2번 주문" + pizza + "\n");

        pizza = chicago.orderPizza("clam");
        System.out.println("3번 주문" + pizza + "\n");

        pizza = ny.orderPizza("pepperoni");
        System.out.println("4번 주문" + pizza + "\n");

        pizza = ny.orderPizza("veggie");
        System.out.println("5번 주문" + pizza + "\n");
    }
}
