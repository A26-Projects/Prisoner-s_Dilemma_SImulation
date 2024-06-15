import java.util.ArrayList;
import java.util.Random;

public class Tournament {

    private static ArrayList<Boolean> listB1 = new ArrayList<>();
    private static ArrayList<Boolean> listB2 = new ArrayList<>();

    public static void main(String[] argus) {
        Bot Random = new BotOne();
        Bot AlwaysCoop = new BotTwo();
        Bot AlwaysDef = new BotThree();
        Bot Tit_for_Tat = new BotFour();
        Bot Alderman = new BotFive();
        Bot Sneaky_Josh = new BotSix();
        tournamentSim(Tit_for_Tat, Sneaky_Josh);
    }


    public static void tournamentSim(Bot b1, Bot b2) {
        boolean optB1 = b1.coopOrNot(), optB2 = b2.coopOrNot();
        System.out.println(optB1 + "      " + optB2);
        checkScoreAssign(b1, b2, optB1, optB2);
        listB1.add(optB1);
        listB2.add(optB2);
        for(int i = 1; i < 200; i++) {
            optB1 = b1.coopOrNotPrev(listB1, listB2);
            optB2 = b2.coopOrNotPrev(listB2, listB1);
            System.out.println(optB1 + "      " + optB2);
            checkScoreAssign(b1, b2, optB1, optB2);
            listB1.add(optB1);
            listB2.add(optB2);
        }
        System.out.println(b1 + " " + b1.getScore());
        System.out.println(b2 + " " + b2.getScore());
    }

    public static void checkScoreAssign(Bot b1, Bot b2, boolean B1, boolean B2) {
        if(B1) {
            if(B2) {
                b1.setScore(3);
                b2.setScore(3);
            } else {
                b2.setScore(5);
            }
        } else {
            if(B2) {
                b1.setScore(5);
            } else {
                b1.setScore(1);
                b2.setScore(1);
            }
        }
    }
}
