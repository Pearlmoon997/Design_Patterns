package FactoryMethod.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("퐁퐁이 주문한"+pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("몽몽이 주문한"+pizza.getName() + "\n");
    }
}
