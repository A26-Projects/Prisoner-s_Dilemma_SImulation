import java.util.ArrayList;
public class BotOne extends Bot {

    @Override
    public boolean coopOrNot() {

        int rand = (int)(Math.round(Math.random()));
        return rand == 0;

    }

    public boolean coopOrNotPrev(ArrayList<Boolean> OwnScore, ArrayList<Boolean> OtherScore) {

        int rand = (int)(Math.round(Math.random()));
        return rand == 0;

    }

    public String toString() {
        return "Random";
    }
}
