package Decorator.Cafe;

import Decorator.Cafe.Beverage.Size;

public class OrderCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "  W" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1.setSize(Size.TALL);
        //모카로 감쌈
        beverage1 = new Mocha(beverage1);
        //모카로 감쌈
        beverage1 = new Mocha(beverage1);
        //휘핑으로 감쌈
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getSize() + "size  " + beverage1.getDescription() + "  W" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        //두유로 감쌈
        beverage2 = new Soy(beverage2);
        //우유로 감쌈
        beverage2 = new Milk(beverage2);
        //모카로 감쌈
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + "  W" + beverage2.cost());
    }
}
