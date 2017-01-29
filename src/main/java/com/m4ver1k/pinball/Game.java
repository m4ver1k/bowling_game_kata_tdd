package com.m4ver1k.pinball;

/**
 * Created by m4ver1k on 29/1/17.
 */
public class Game {

    private int score;

    public void roll(int pins) {
        score+=pins;
    }

    public int getScore() {
        return score;
    }
}
