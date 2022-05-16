package Strategy.Challenge;

public class H_wizardHP implements Hp{
    @Override
    public void showHp() {
        System.out.println(Hp.msg + "60");
    }
}
