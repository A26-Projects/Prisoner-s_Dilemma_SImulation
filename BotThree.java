import java.util.ArrayList;
public class BotThree extends Bot {

    @Override
    public boolean coopOrNot() {
        return false;
    }

    public boolean coopOrNotPrev(ArrayList<Boolean> OwnScore, ArrayList<Boolean> OtherScore) {
        return false;
    }

    public String toString() {
        return "Always Defects";
    }
}
