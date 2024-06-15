import java.util.ArrayList;
public class BotTwo extends Bot {

    @Override
    public boolean coopOrNot() {
        return true;
    }

    public boolean coopOrNotPrev(ArrayList<Boolean> OwnScore, ArrayList<Boolean> OtherScore) {
        return true;
    }

    public String toString() {
        return "Always Cooperates";
    }

}

