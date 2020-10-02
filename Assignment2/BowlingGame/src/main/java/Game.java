public class Game {

    private final int[] rolls = new int[21];
    private int currentRoll;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++)
            if (isStrike(frameIndex))
            {
                score += 10 +
                        rolls[frameIndex+1] +
                        rolls[frameIndex + 2];
                frameIndex++;

            } else if (isSpare(frameIndex)) // spare
            {
                score += 10 + rolls[frameIndex + 2];
                frameIndex += 2;
            } else {
                score += rolls[frameIndex] + rolls[frameIndex + 1];
                frameIndex += 2;
            }

        return score;
    }



    private int sumOfBallsInFrame(int frameIndex){
        return rolls[frameIndex] + rolls[frameIndex + 1];
    }

    private int spareBonus(int frameIndex){
        return rolls[frameIndex +2];
    }

    private int strikeBonus(int frameIndex){
        return rolls[frameIndex] + rolls[frameIndex + 1];
    }

    private boolean isSpare(int frameIndex){
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }

    private boolean isStrike(int frameIndex){
        return rolls[frameIndex] == 10;
    }

}
