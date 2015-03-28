package formPackageOne;

/**
 * Created by Mel on 3/28/2015.
 */
public class Npc {

    private String name;
    private int maxHealth;
    private int currentHealth;
    private Class cClassOne;
    private Class cClassTwo;
    private Class cClassThree;
    private int levelOne;
    private int levelTwo;
    private int levelThree;
    private int[] abilityScores = new int[6];

    public Npc(String name, int health, Class cClassOne, int levelOne, int[] abilityScores) {
        this.name = name;
        this.maxHealth=health;
        this.currentHealth=this.maxHealth;
        this.cClassOne = cClassOne;
        this.levelOne = levelOne;
        this.abilityScores = abilityScores;
    }
}
