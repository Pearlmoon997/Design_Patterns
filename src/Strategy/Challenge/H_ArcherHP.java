package Strategy.Challenge;

public class H_ArcherHP implements Hp{
    @Override
    public void showHp() {
        System.out.println(Hp.msg + "80");
    }
}
