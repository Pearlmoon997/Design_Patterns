package Strategy.Challenge;

public class GameSimulator {
    public static void main(String[] args){
        Character warrior = new Warrior();
        Character knight = new Knight();
        Character wizard = new Wizard();
        Character archer = new Archer();

        warrior.display();
        warrior.weapon.showWeapon();
        warrior.skill.showSkill();
        warrior.hp.showHp();

        knight.display();
        knight.weapon.showWeapon();
        knight.skill.showSkill();
        knight.hp.showHp();

        wizard.display();
        wizard.weapon.showWeapon();
        wizard.skill.showSkill();
        wizard.hp.showHp();

        archer.display();
        archer.weapon.showWeapon();
        archer.skill.showSkill();
        archer.hp.showHp();
    }
}
