package Strategy.Challenge;

public class S_Earthquake implements Skill{
    @Override
    public void showSkill() {
        System.out.println(Skill.msg + "지면강타!");
    }
}
