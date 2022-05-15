package Strategy;

public class RedheadDuck extends Duck{
    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("나는 붉은 머리 오리!!!");
    }
}
