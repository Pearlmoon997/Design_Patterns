package Strategy.Challenge;

public class H_knightHP implements Hp{
    @Override
    public void showHp() {
        System.out.println(Hp.msg + "100");
    }
}
