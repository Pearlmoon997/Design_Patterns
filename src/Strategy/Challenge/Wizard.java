package Strategy.Challenge;

public class Wizard extends Character{
    public Wizard(){
        weapon = new Wand();
        skill = new S_Icebeam();
        hp = new H_wizardHP();
    }

    public void display() {
        System.out.println("직업: 마법사");
    }
}
