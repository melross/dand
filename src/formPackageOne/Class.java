package formPackageOne;

/**
 * Created by Mel on 3/28/2015.
 */
public class Class {

    private String name;
    private int hitDie;
    private int saveProfOne;
    private int saveProfTwo;

    public Class() {
        name = "Generic";
        hitDie = 6;
        saveProfOne = 1;
        saveProfTwo = 2;
    }

    public int getHitDie() {
        return hitDie;
    }

    public int getSaveProfTwo() {
        return saveProfTwo;
    }

    public int getSaveProfOne() {

        return saveProfOne;
    }

    public String getName() {
        return name;
    }
}
