package peaksoft;

import java.util.Random;

/**
 * @author Beksultan
 */
public class Dice {

    private int value;

    public Dice() {
        this.value = getRandomNumber();
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(1, 7);
    }

    public int rollDice() {
        this.value = getRandomNumber();
        return value;
    }

    @Override
    public String toString() {
        return switch (value) {
            case 1 -> """
                          
                          #
                          
                    """;
            case 2 -> """
                          
                        #    #
                          
                    """;
            case 3 -> """
                           #
                        #     #
                          
                    """;
            case 4 -> """
                           #
                        #     #
                           #
                    """;
            case 5 -> """
                           #
                        #  #  #
                           #
                    """;
            case 6 -> """
                          #   #
                          #   #  
                          #   #
                    """;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
