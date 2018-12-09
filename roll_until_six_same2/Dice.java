import java.util.Random;

public class Dice {


    protected Dice() {
    }

    protected int rolling() {
        Random rand = new Random();
        int singleRoll = 1 + rand.nextInt(6);
        return singleRoll;
    }

    public void rollWithAllDices() {

    }

}
