package Strategy.Challenge;

public class Bow implements Weapon{
    @Override
    public void showWeapon() {
        System.out.println(Weapon.msg + "백발백중 활");
    }
}
