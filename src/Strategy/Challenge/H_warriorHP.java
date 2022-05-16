package Strategy.Challenge;

public class H_warriorHP implements Hp{
    @Override
    public void showHp() {
        System.out.println(Hp.msg + "120");
    }
}
