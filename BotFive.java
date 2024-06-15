import java.util.ArrayList;
public class BotFive extends Bot {

    @Override
    public boolean coopOrNot() {
        return true;
    }

    public boolean coopOrNotPrev(ArrayList<Boolean> OwnScore, ArrayList<Boolean> OtherScore) {
        boolean temp = true;
        for (Boolean b : OtherScore) {
            if (!b) {
                temp = false;
                break;
            }
        }
       return temp;
    }

    public String toString() {
        return "Grudge Holder";
    }
}
