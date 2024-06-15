import java.util.ArrayList;
public class BotSix extends Bot {

    @Override
    public boolean coopOrNot() {

        return true;

    }

    public boolean coopOrNotPrev(ArrayList<Boolean> OwnScore, ArrayList<Boolean> OtherScore) {

        if (!(OtherScore.get(OtherScore.size() - 1))) {
            return false;
        } else {
            int rand = (int)(Math.random()*10);
            return rand != 0;
        }

    }

    public String toString() {
        return "Sneaky Josh";
    }
}
