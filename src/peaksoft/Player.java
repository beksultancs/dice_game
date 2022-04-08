package peaksoft;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Beksultan
 */
public class Player {
    private GamePlayer gamePlayer;
    private Stack<GameResult> gameResults = new Stack<GameResult>();

    public Player(GamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    public GameResult playDices(Dice dice, Dice dice2) {
        int result = dice.rollDice() + dice2.rollDice();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int predictedNumber;
        if (gamePlayer.equals(GamePlayer.USER)) {
            do {
                System.out.print("your guess: ");
                predictedNumber = scanner.nextInt();
            } while (predictedNumber < 2 || predictedNumber > 12);
        } else {
            System.out.println("computer guess...");
            predictedNumber = random.nextInt(2, 13);
        }

        GameResult gameResult = new GameResult(
                predictedNumber,
                result
        );

        System.out.println("dices rolling...");
        System.out.println(dice);
        System.out.println(dice2);

        gameResults.push(gameResult);

        return gameResult;
    }

    public void getResult() {
        GameResult result = gameResults.pop();
        if (gamePlayer.equals(GamePlayer.USER)) {
            printResult(result, "user wins!!!", "user loses!!!");
        } else {
            printResult(result, "computer wins!!!", "computer loses!!!");
        }

        System.out.println(result);
    }

    private void printResult(GameResult result, String s, String s2) {
        if (result.getResult() > 0) {
            System.out.println(s);
        } else {
            System.out.println(s2);
        }
    }
}
