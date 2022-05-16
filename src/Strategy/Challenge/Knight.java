package Strategy.Challenge;

public class Knight extends Character{
    public Knight(){
        weapon = new Sword();
        skill = new S_Combo();
        hp = new H_knightHP();
    }

    public void display() {
        String job = "직업";
        System.out.println(job + ": 기사");
    }
}
