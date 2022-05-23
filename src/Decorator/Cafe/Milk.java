package Decorator.Cafe;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", milk";
    }

    public double cost() {
        return beverage.cost() + 100;
    }
}
