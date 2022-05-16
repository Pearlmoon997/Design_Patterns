package Strategy.Challenge;

public class Warrior extends Character{
    public Warrior() {
        weapon = new Axe();
        skill = new S_Earthquake();
        hp = new H_warriorHP();
    }

    public void display(){
        super.display();
        System.out.println("전사");
    }
}
