package Strategy.Challenge;

public abstract class Character {
    // 필드
    Weapon weapon;
    Skill skill;
    Hp hp;

    // 메소드
    public Character() {}

    public void display(){
        System.out.printf("직업: ");
    }

    public void Weapon(){
        weapon.showWeapon();
    }


    public void Skill(){
        skill.showSkill();}

    public void Hp(){hp.showHp();}
}
