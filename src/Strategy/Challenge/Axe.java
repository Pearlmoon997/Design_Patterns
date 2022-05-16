package Strategy.Challenge;

public class Axe implements Weapon{
    @Override
    public void showWeapon() {
        System.out.println(Weapon.msg + "최강도끼");
    }
}
