import java.util.ArrayList;
public class BotFour extends Bot {

    @Override
    public boolean coopOrNot() {

        return true;

    }

    public boolean coopOrNotPrev(ArrayList<Boolean> OwnScore, ArrayList<Boolean> OtherScore) {

        return OtherScore.get(OtherScore.size() - 1);

    }

    public String toString() {
        return "Tit fot Tat";
    }
}
