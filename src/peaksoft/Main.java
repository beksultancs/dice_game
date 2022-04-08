package peaksoft;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        Player user = new Player(GamePlayer.COMPUTER);

        user.playDices(dice1, dice2);

        user.getResult();
    }
}
