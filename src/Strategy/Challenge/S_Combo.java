package Strategy.Challenge;

public class S_Combo implements Skill{
    @Override
    public void showSkill() {
        System.out.println(Skill.msg + "콤보어택!");
    }
}
