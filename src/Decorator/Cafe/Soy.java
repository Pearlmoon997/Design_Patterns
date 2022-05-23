package Decorator.Cafe;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", soy";
    }

    public double cost() {
        return beverage.cost() + 100;
    }
}
