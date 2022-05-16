package Strategy.Challenge;

public class S_Triple implements Skill{
    @Override
    public void showSkill() {
        System.out.println(Skill.msg + "삼중발사!");
    }
}
