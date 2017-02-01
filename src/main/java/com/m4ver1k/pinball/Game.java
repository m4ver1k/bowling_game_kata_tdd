package com.m4ver1k.pinball;

/**
 * Created by m4ver1k on 29/1/17.
 */
public class Game {

    private int[] rolls = new int[21];
    private int currentRoll;

    public void roll(int pins) {
        rolls[currentRoll++]=pins;
    }

    public int getScore() {
        int score = 0;
        int frameIndex=0;
        for(int frame =0;frame<10;frame++){

            if(isStrike(frameIndex)){
                score+= 10 + strikeBonus(frameIndex);
                frameIndex++;
            }
           else if(this.isSpare(frameIndex)){
               score+=10+ spareBonus(frameIndex);
                frameIndex+=2;
           }else{
               score+=sumOfRollsInFrame(frameIndex);
                frameIndex+=2;
           }

        }

        return score;
    }

    private int sumOfRollsInFrame(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex+1];
    }

    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex] ==10;
    }

    private int spareBonus(int frameIndex) {
        return rolls[frameIndex + 2];
    }

    private int strikeBonus(int frameIndex) {
        return rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

    private boolean isSpare(int frameIndex){
        return sumOfRollsInFrame(frameIndex) ==10;

    }
}
