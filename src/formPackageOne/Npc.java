package formPackageOne;

import java.util.Random;

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

    //Standard Constructor
    public Npc(String name, int health, Class cClassOne, int levelOne, int[] abilityScores) {
        this.name = name;
        this.maxHealth = health;
        this.currentHealth = this.maxHealth;
        this.cClassOne = cClassOne;
        this.levelOne = levelOne;
        this.abilityScores = abilityScores;
    }

    //Standard Constructor w/ Random Health
    public Npc(String name, Class cClassOne, int levelOne, int[] abilityScores) {
        this.name = name;
        this.cClassOne = cClassOne;
        this.levelOne = levelOne;
        this.abilityScores = abilityScores;
        this.maxHealth=randHealth();
        this.currentHealth=this.maxHealth;
    }

    private int randHealth() {
        Random rand = new Random();
        int calcHealth = 0;
        int hitDieOne = cClassOne.getHitDie();
        for(int i=0; i<levelOne; i++){
            calcHealth += rand.nextInt(hitDieOne);
        }
       calcHealth+= (levelOne*hitDieOne);
       if(cClassTwo!=null) {
           int hitDieTwo = cClassTwo.getHitDie();
           for (int j = 0; j < levelTwo++; j++) {
               calcHealth += rand.nextInt(hitDieTwo);
           }
           calcHealth += rand.nextInt(hitDieTwo);
       }
        if(cClassThree!=null) {
            int hitDieThree = cClassThree.getHitDie();
            for (int k = 0; k < levelThree++; k++) {
                calcHealth += rand.nextInt(hitDieThree);
            }
            calcHealth += rand.nextInt(hitDieThree);
        }

        return 0;
    }
}
