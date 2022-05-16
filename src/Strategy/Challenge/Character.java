package Strategy.Challenge;

public abstract class Character {
    Weapon weapon;
    Skill skill;
    Hp hp;

    public Character() {}

    public abstract void display();

    public void Weapon(){weapon.getWeapon();}

    public void Skill(){skill.getSkill();}

    public void Hp(){hp.getHp();}
}
