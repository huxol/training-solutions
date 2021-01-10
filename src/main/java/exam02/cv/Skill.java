package exam02.cv;

public class Skill {

    public String name;
    public String skill;
    public int level;

    public Skill(String name, String skill, int level) {
        this.name = name;
        this.skill = skill;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }

    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
