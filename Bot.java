import java.util.ArrayList;
public abstract class Bot {
    private int score = 0;

    public int getScore() {
        return score;
    }

    public void setScore(int s) {
        score += s;
    }

    public abstract boolean coopOrNot();

    public abstract boolean coopOrNotPrev(ArrayList<Boolean> OwnScore, ArrayList<Boolean> OtherScore);

}