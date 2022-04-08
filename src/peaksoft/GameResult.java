package peaksoft;

/**
 * @author Beksultan
 */
public class GameResult {
    private int predicted;
    private int dice;
    private int result;

    public GameResult(int predicted, int dice) {
        this.predicted = predicted;
        this.dice = dice;
        this.result = dice - Math.abs(dice - predicted) * 2;
    }

    public GameResult() {
    }

    public int getPredicted() {
        return predicted;
    }

    public void setPredicted(int predicted) {
        this.predicted = predicted;
    }

    public int getDice() {
        return dice;
    }

    public void setDice(int dice) {
        this.dice = dice;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "GameResult [" +
                " predicted = " + predicted +
                ", dice = " + dice +
                ", result = " + result +
                ']';
    }
}
