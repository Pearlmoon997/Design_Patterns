package Strategy.Challenge;

public class S_Icebeam implements Skill{
    @Override
    public void showSkill() {
        System.out.println(Skill.msg + "얼음빔!");
    }
}
