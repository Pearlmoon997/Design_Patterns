package Strategy.Challenge;

public class Archer extends Character{
    public Archer(){
        weapon = new Bow();
        skill = new S_Triple();
        hp = new H_ArcherHP();
    }

    public void display() {
        System.out.println("μ§μ: κΆμ");
    }
}
