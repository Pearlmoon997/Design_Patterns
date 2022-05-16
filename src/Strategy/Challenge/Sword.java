package Strategy.Challenge;

public class Sword implements Weapon{
    @Override
    public void showWeapon() {
        System.out.println(Weapon.msg + "무적검");
    }
}
