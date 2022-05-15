package Strategy;

public class DecoyDuck extends Duck{
    public DecoyDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("나는 장난감오리!!!");
    }
}
