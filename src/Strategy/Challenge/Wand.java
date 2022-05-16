package Strategy.Challenge;

public class Wand implements Weapon{
    @Override
    public void showWeapon() {
        System.out.println(Weapon.msg + "해리포터의 지팡이");
    }
}
