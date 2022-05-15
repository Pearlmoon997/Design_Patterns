package Strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck redhead = new RedheadDuck();

        redhead.display();
        redhead.performQuack();
        redhead.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowerd());
        model.performFly();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performQuack();
        rubber.performFly();
        rubber.setFlyBehavior(new FlyRocketPowerd());
        rubber.performFly();

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performQuack();
        decoy.performFly();
    }
}
